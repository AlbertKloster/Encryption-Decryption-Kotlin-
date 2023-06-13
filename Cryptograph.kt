package encryptdecrypt

class Cryptograph {
    fun encrypt(string: String, key: Int): String {
        val encryptedString = StringBuilder()
        for (char in string) {
            encryptedString.append(shiftCharacterByKey(char, key))
        }
        return encryptedString.toString()
    }

    fun decrypt(encryptedString: String, key: Int) = encrypt(encryptedString, -1 * key)

    private fun shiftCharacterByKey(char: Char, key: Int) = 'a' + (char - 'a' + key)
}