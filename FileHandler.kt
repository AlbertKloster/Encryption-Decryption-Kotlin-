package encryptdecrypt

import java.io.File

class FileHandler {
    fun read(filename: String): String {
        return try {
            File(filename).readText()
        } catch (e: RuntimeException) {
            throw RuntimeException("Error in reading file $filename")
        }
    }

    fun write(filename: String, data: String) {
        try {
            File(filename).writeText(data)
        } catch (e: RuntimeException) {
            throw RuntimeException("Error in writing file $filename")
        }
    }
}