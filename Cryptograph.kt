package encryptdecrypt

class Cryptograph {
    fun encrypt(key: Int, string: String): String {
        val encryptedString = StringBuilder()
        for (char in string) {
            encryptedString.append(shiftCharacterByKey(char, key))
        }
        return encryptedString.toString()
    }

    fun decrypt(key: Int, encryptedString: String) = encrypt(-1 * key, encryptedString)

    private fun shiftCharacterByKey(char: Char, key: Int) = 'a' + (char - 'a' + key)

}