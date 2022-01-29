package io.github.abductcows.antlrtests.declaration

import io.github.abductcows.antlrtests.ThrowOnParserError
import io.github.abductcows.antlrtests.antlr.declaration.DeclarationLexer
import io.github.abductcows.antlrtests.antlr.declaration.DeclarationParser
import io.github.abductcows.antlrtests.appendToFileName
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

fun main() {
    val myArgs = arrayOf("src/test/resources/sample.txt")

    for (fileName in myArgs) {
        val file = CharStreams.fromFileName(fileName)
        val lexer = DeclarationLexer(file)
        val tokenStream = CommonTokenStream(lexer)
        val parser = DeclarationParser(tokenStream)
        parser.addErrorListener(ThrowOnParserError)
        val parseTree = parser.file()

        val visitor = DeclarationVisitor(outputFileName = appendToFileName(fileName, ".out"))
        visitor.visit(parseTree)
    }
}
