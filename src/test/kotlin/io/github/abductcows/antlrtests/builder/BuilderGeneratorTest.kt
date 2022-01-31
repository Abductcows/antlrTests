package io.github.abductcows.antlrtests.builder

import io.github.abductcows.antlrtests.appendToFileName
import io.github.abductcows.antlrtests.changeFileEnding
import org.apache.commons.io.FileUtils
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import java.io.File

internal class BuilderGeneratorTest {

    companion object {

        private const val baseDir = "src/test/resources/assertions/"
        private val testFileBaseNames = listOf(
            "User"
        )

        @JvmStatic
        fun getAllBaseTestFileNames(): Iterable<String> = testFileBaseNames

        @BeforeAll
        @JvmStatic
        fun ensureTestFilesExist() {
            for (baseName in testFileBaseNames) {
                assertTrue(
                    File(fullNameOfTestFile(baseName)).exists()
                )
            }
        }

        @BeforeAll
        @JvmStatic
        fun ensureExpectedFilesExist() {
            for (baseName in testFileBaseNames) {
                assertTrue(
                    File(fullNameOfExpectedFile(baseName)).exists()
                )
            }
        }

        private fun fullNameOfTestFile(baseName: String) = "$baseDir$baseName.txt"
        private fun fullNameOfExpectedFile(baseName: String) = "$baseDir$baseName.java"
    }

    private var lastFileName: String? = null

    @AfterEach
    fun cleanupLast() {
        lastFileName?.let {
            if (!File(it).delete()) {
                System.err.println("Trouble deleting $it")
            }
        }
    }

    @ParameterizedTest
    @MethodSource("getAllBaseTestFileNames")
    @DisplayName("file compiles")
    fun `file compiles`(baseName: String) {
        // given
        val inputName = fullNameOfTestFile(baseName)

        // when/then
        runCompilerFor(inputName)
    }


    @ParameterizedTest
    @MethodSource("getAllBaseTestFileNames")
    @DisplayName("compiler output matches expected")
    fun `file output matches expected`(baseName: String) {
        // given
        val inputName = fullNameOfTestFile(baseName)

        // when
        runCompilerFor(inputName)

        // then
        val expectedFile = File(fullNameOfExpectedFile(baseName))
        val outputFile = File(getTestOutputName(inputName))
        FileUtils.contentEquals(expectedFile, outputFile)
    }

    private fun runCompilerFor(inputName: String) {
        val outputName = getTestOutputName(inputName)
        lastFileName = outputName
        generateFor(inputName, outputName)
    }

    private fun getTestOutputName(inputName: String): String {
        val inputNameWithAppend = appendToFileName(inputName, "TestOutput")
        return changeFileEnding(inputNameWithAppend, ".java")
    }
}