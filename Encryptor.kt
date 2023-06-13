package encryptdecrypt

class Encryptor {
    fun encrypt(string: String): String {
        val encryptedString = StringBuilder()
        for (char in string) {
            encryptedString.append(if (char in 'a'..'z') getOppositeCharacter(char) else char)
        }
        return encryptedString.toString()

    }

    private fun getOppositeCharacter(char: Char): Char {
        val offset = char - 'a'
        return 'z' - offset
    }
}