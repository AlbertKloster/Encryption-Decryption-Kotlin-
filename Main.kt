package encryptdecrypt

fun main() {
    val encryptor = Encryptor()
    val string = readln()
    val key = readln().toInt()
    println(encryptor.encrypt(string, key))
}