package encryptdecrypt

const val NUMBER_OF_LETTERS = 26

class Cryptograph {
    fun encrypt(key: Int, string: String, alg: String): String {
        return when (alg) {
            "unicode" -> encryptUnicode(key, string)
            "shift" -> encryptShift(key, string)
            else -> throw RuntimeException("Error: Unknown algorithm $alg")
        }
    }

    fun decrypt(key: Int, encryptedString: String, alg: String): String {
        return when (alg) {
            "unicode" -> decryptUnicode(key, encryptedString)
            "shift" -> decryptShift(key, encryptedString)
            else -> throw RuntimeException("Error: Unknown algorithm $alg")
        }
    }

    private fun encryptUnicode(key: Int, string: String): String {
        val encryptedString = StringBuilder()
        for (char in string) {
            encryptedString.append(shiftCharacterByKey(char, key))
        }
        return encryptedString.toString()
    }

    private fun encryptShift(key: Int, string: String): String {
        val encryptedString = StringBuilder()
        for (char in string) {
            encryptedString.append(shiftLetterByKey(char, key))
        }
        return encryptedString.toString()
    }

    private fun decryptUnicode(key: Int, encryptedString: String): String {
        return encryptUnicode(-1 * key, encryptedString)
    }

    private fun decryptShift(key: Int, encryptedString: String): String {
        return encryptShift(-1 * key, encryptedString)
    }

    private fun shiftCharacterByKey(char: Char, key: Int) = 'a' + (char - 'a' + key)

    private fun shiftLetterByKey(char: Char, key: Int): Char {
        val offset = if (char.isLowerCase()) 'a' else 'A'
        return if (char.isLetter()) {
            offset + (char - offset + NUMBER_OF_LETTERS + key) % NUMBER_OF_LETTERS
        } else char
    }

}