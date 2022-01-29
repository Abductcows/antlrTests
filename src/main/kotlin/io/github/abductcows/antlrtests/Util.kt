package io.github.abductcows.antlrtests

import org.antlr.v4.runtime.BaseErrorListener
import org.antlr.v4.runtime.RecognitionException
import org.antlr.v4.runtime.Recognizer

@Suppress("SameParameterValue")
fun appendToFileName(original: String, toAppend: String): String {
    val parts = original.split(delimiters = arrayOf("."), limit = 2)

    val name = parts[0]
    val rest = when (parts.size) {
        1 -> ""
        else -> ".${parts[1]}"
    }

    return "$name$toAppend$rest"
}

fun changeFileEnding(originalName: String, newEnding: String) : String {

    val indexOfLastDot = originalName.indexOfLast { it == '.' }
    if (indexOfLastDot < 0) return "$originalName$newEnding"

    return originalName.substring(0, indexOfLastDot) + newEnding
}

object ThrowOnParserError : BaseErrorListener() {

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