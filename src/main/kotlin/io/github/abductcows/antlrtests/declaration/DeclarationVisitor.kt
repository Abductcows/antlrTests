package io.github.abductcows.antlrtests.declaration

import io.github.abductcows.antlrtests.antlr.declaration.DeclarationBaseVisitor
import io.github.abductcows.antlrtests.antlr.declaration.DeclarationParser
import java.io.File

class DeclarationVisitor(outputFileName: String) : DeclarationBaseVisitor<Unit>() {

    private val outputFile: File = File(outputFileName)

    override fun visitFile(ctx: DeclarationParser.FileContext?) {

        outputFile.writeText("")
        super.visitFile(ctx)
    }

    override fun visitDeclaration(ctx: DeclarationParser.DeclarationContext?) {
        val variableNames: List<DeclarationParser.VariableNameContext> = ctx?.variableName() ?: listOf()
        val type = ctx?.TYPE()?.text

        val declarationOutput = buildString {

            variableNames.forEachIndexed { i, nameCtx ->

                append(nameCtx.ID().text)
                if (i < variableNames.size - 1) {
                    append(", ")
                }
            }

            type?.let {
                append(": $it")
            }
        }

        declarationOutput.takeIf { it.isNotEmpty() }?.let {
            outputFile.appendText(it + "\n")
        }
    }
}