package encryptdecrypt

class Encryptor {
    fun encrypt(string: String, key: Int): String {
        val encryptedString = StringBuilder()
        for (char in string) {
            encryptedString.append(if (char in 'a'..'z') shiftCharacterByKey(char, key) else char)
        }
        return encryptedString.toString()

    }

    private fun shiftCharacterByKey(char: Char, key: Int): Char {
        val numberOfLetters = 'z' - 'a' + 1
        return 'a' + (char - 'a' + key) % numberOfLetters
    }
}