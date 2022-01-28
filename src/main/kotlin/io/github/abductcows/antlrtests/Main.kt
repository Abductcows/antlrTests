package io.github.abductcows.antlrtests

import io.github.abductcows.antlrtests.antlr.DeclarationLexer
import io.github.abductcows.antlrtests.antlr.DeclarationParser
import org.antlr.v4.runtime.*

fun main(args: Array<String>) {
    val myArgs = arrayOf("src/test/resources/sample.txt")

    for (fileName in myArgs) {
        val file = CharStreams.fromFileName(fileName)
        val lexer = DeclarationLexer(file)
        val tokenStream = CommonTokenStream(lexer)
        val parser = DeclarationParser(tokenStream)
        parser.addErrorListener(throwOnParserError)
        val parseTree = parser.file()

        val visitor = DeclarationVisitor(outputFileName = appendToFileName(fileName, ".out"))
        visitor.visit(parseTree)
    }
}

@Suppress("SameParameterValue")
private fun appendToFileName(original: String, toAppend: String): String {
    val parts = original.split(delimiters = arrayOf("."), limit = 2)

    val name = parts[0]
    val rest = when (parts.size) {
        1 -> ""
        else -> ".${parts[1]}"
    }

    return "$name$toAppend$rest"
}

private val throwOnParserError = object : BaseErrorListener() {
    override fun syntaxError(
        recognizer: Recognizer<*, *>?,
        offendingSymbol: Any?,
        line: Int,
        charPositionInLine: Int,
        msg: String?,
        e: RecognitionException?,
    ) {
        throw RuntimeException("BAD SYNTAX")
    }
}