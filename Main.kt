package encryptdecrypt

val cryptograph = Cryptograph()
fun main() {
    try {
        when (Operations.getOperation(readln())) {
            Operations.ENC -> encrypt()
            Operations.DEC -> decrypt()
        }
    } catch (e: RuntimeException) {
        println(e.message)
    }
}

private fun encrypt() {
    println(cryptograph.encrypt(readln(), readln().toInt()))
}

private fun decrypt() {
    println(cryptograph.decrypt(readln(), readln().toInt()))
}