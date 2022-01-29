package io.github.abductcows.antlrtests.builder

import io.github.abductcows.antlrtests.ThrowOnParserError
import io.github.abductcows.antlrtests.antlr.builder.BuilderLexer
import io.github.abductcows.antlrtests.antlr.builder.BuilderParser
import io.github.abductcows.antlrtests.changeFileEnding
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTreeWalker

fun main() {

    // (from arguments)
    val fileName = "src/test/resources/User.txt"
    var outputName = ""

    // program

    if (outputName.isEmpty()) {
        outputName = changeFileEnding(fileName, ".java")
        println(outputName)
    }

    val file = CharStreams.fromFileName(fileName)
    val lexer = BuilderLexer(file)
    val tokenStream = CommonTokenStream(lexer)
    val parser = BuilderParser(tokenStream)
    parser.addErrorListener(ThrowOnParserError)
    val parseTree = parser.class_declaration()

    val listener = BuilderListener(outputName)
    val treeWalker = ParseTreeWalker()

    treeWalker.walk(listener, parseTree)
}