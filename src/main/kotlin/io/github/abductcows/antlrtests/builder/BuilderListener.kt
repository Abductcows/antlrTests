package io.github.abductcows.antlrtests.builder

import io.github.abductcows.antlrtests.antlr.builder.BuilderBaseListener
import io.github.abductcows.antlrtests.antlr.builder.BuilderParser
import java.io.File
import java.util.*

private typealias Type = String
private typealias VariableNames = MutableList<String>

class BuilderListener(private val outputName: String, private val builderName: String = "Builder") : BuilderBaseListener() {

    private val sb = StringBuilder(2000)
    private var indentLevel = 0
    private val requiredMembers = mutableMapOf<Type, VariableNames>()
    private val optionalMembers = mutableMapOf<Type, VariableNames>()

    private lateinit var className: String
    private lateinit var outputFile: File

    override fun enterClass_declaration(ctx: BuilderParser.Class_declarationContext?) {

        className = ctx!!.class_name().text
        outputFile = File(outputName)
    }

    override fun exitClass_declaration(ctx: BuilderParser.Class_declarationContext?) {

        writeOutput()
        flushToFile()
    }

    override fun enterMember_line(ctx: BuilderParser.Member_lineContext?) {
        val type = ctx!!.type().text

        for (reqMember in ctx.required_members()) {
            for (id in reqMember.ID()) {

                addRequiredMember(type, id.text)
            }
        }

        for (optMember in ctx.optional_members()) {
            for (id in optMember.ID()) {

                addOptionalMember(type, id.text)
            }
        }
    }

    private fun addRequiredMember(type: Type, id: String) {

        requiredMembers.computeIfAbsent(type) { mutableListOf() }
            .add(id)
    }

    private fun addOptionalMember(type: Type, id: String) {

        optionalMembers.computeIfAbsent(type) { mutableListOf() }
            .add(id)
    }

    private fun forEachNameWithTypeIn(map: Map<Type, VariableNames>, block: (Type, String) -> Unit) {

        for ((type: Type, variableNames: MutableList<String>) in map) {
            for (name in variableNames) {
                block(type, name)
            }
        }
    }

    private fun forEachNameIn(map: Map<Type, VariableNames>, block: (String) -> Unit) = forEachNameWithTypeIn(map) { _, name -> block(name) }

    private fun <T> withNextIndent(block: () -> T) {
        ++indentLevel
        block()
        --indentLevel
    }


    private fun writeOutput() {
        write("public class $className {")
        withNextIndent {
            write()
            writeFieldsAsFinal()
            write()
            writeClassConstructor()
            write()
            writeClassGetters()
            write()
            writeBuilder()
        }
        write("}")
    }

    private fun writeFieldsAsFinal() {
        for (members in listOf(requiredMembers, optionalMembers)) {
            forEachNameWithTypeIn(members) { type, name ->
                write("private final $type $name;")
            }
        }
    }

    private fun writeClassConstructor() {
        write("private $className($builderName builder) {")
        withNextIndent {
            for (members in listOf(requiredMembers, optionalMembers)) {
                forEachNameIn(members) { name ->
                    write("this.$name = builder.$name;")
                }
            }
        }
        write("}")
    }

    private fun writeClassGetters() {
        for (members in listOf(requiredMembers, optionalMembers)) {
            forEachNameWithTypeIn(members) { type, name ->
                val tileCasedName = name.replaceFirstChar { it.uppercaseChar() }
                write("public $type get$tileCasedName() { return $name; }")
            }
        }
    }

    private fun writeFields() {

        forEachNameWithTypeIn(requiredMembers) { type, name ->
            write("private final $type $name;")
        }

        forEachNameWithTypeIn(optionalMembers) { type, name ->
            write("private $type $name;")
        }
    }

    private fun writeBuilder() {
        write("public static class $builderName {")
        withNextIndent {
            writeFields()
            write()
            writeBuilderConstructor()
            write()
            writeBuilderMethods()
            write()
            writeBuild()
        }
        write("}")
    }

    private fun writeBuilderConstructor() {
        val argList = joinString(", ") {
            forEachNameWithTypeIn(requiredMembers) { type, name ->
                add("$type $name")
            }
        }

        write("public $builderName($argList) {")
        withNextIndent {
            forEachNameIn(requiredMembers) { name ->
                write("this.$name = $name;")
            }
        }
        write("}")
    }

    private fun writeBuilderMethods() {

        forEachNameWithTypeIn(optionalMembers) { type, name ->
            write("public $builderName $name($type $name) {")
            withNextIndent {
                write("this.$name = $name;")
                write("return this;")
            }
            write("}")
        }
    }

    private fun writeBuild() {

        write("public $className build() {")
        withNextIndent {
            write("return new $className(this);")
        }
        write("}")
    }

    private fun write(string: String = "") {

        repeat(indentLevel) { sb.append(TAB) }
        sb.append(string)
        sb.append('\n')
    }

    private fun flushToFile() {

        outputFile.appendText(sb.toString())
    }

    companion object {

        private const val TAB = "    "
    }
}

fun joinString(sep: CharSequence, joinBlock: StringJoiner.() -> Unit): String =
    StringJoiner(sep).apply(joinBlock).toString()