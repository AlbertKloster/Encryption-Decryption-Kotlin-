package encryptdecrypt

val cryptograph = Cryptograph()
fun main(args: Array<String>) {
    try {
        val mode = getMode(args)
        val key = getKey(args)
        val data = getData(args)
        when (mode) {
            Mode.ENC -> encrypt(key, data)
            Mode.DEC -> decrypt(key, data)
        }
    } catch (e: RuntimeException) {
        println(e.message)
    }
}

private fun encrypt(key: Int, data: String) {
    println(cryptograph.encrypt(key, data))
}

private fun decrypt(key: Int, data: String) {
    println(cryptograph.decrypt(key, data))
}

private fun getMode(args: Array<String>): Mode {
    val index = args.indexOf("-mode")
    if (index == -1) {
        return Mode.ENC
    }
    return Mode.getMode(args[index + 1])
}

private fun getKey(args: Array<String>): Int {
    val index = args.indexOf("-key")
    if (index == -1) {
        return 0
    }
    return args[index + 1].toInt()
}

private fun getData(args: Array<String>): String {
    val index = args.indexOf("-data")
    if (index == -1) {
        return ""
    }
    return args[index + 1]
}