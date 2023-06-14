package encryptdecrypt

val cryptograph = Cryptograph()
val fileHandler = FileHandler()
fun main(args: Array<String>) {
    try {
        val mode = getMode(args)
        val key = getKey(args)
        val data = getData(args)
        val out = getOut(args)
        when (mode) {
            Mode.ENC -> encrypt(key, data, out)
            Mode.DEC -> decrypt(key, data, out)
        }
    } catch (e: RuntimeException) {
        println(e.message)
    }
}

private fun encrypt(key: Int, data: String, out: String) {
    if (out.isEmpty()) {
        println(cryptograph.encrypt(key, data))
    } else {
        fileHandler.write(out, cryptograph.encrypt(key, data))
    }
}

private fun decrypt(key: Int, data: String, out: String) {
    if (out.isEmpty()) {
        println(cryptograph.decrypt(key, data))
    } else {
        fileHandler.write(out, cryptograph.decrypt(key, data))
    }
}

private fun getMode(args: Array<String>): Mode {
    val index = args.indexOf("-mode")
    return if (index == -1) Mode.ENC else Mode.getMode(args[index + 1])
}

private fun getKey(args: Array<String>): Int {
    val index = args.indexOf("-key")
    return if (index == -1) 0 else args[index + 1].toInt()
}

private fun getData(args: Array<String>): String {
    val indexData = args.indexOf("-data")
    val indexIn = args.indexOf("-in")

    if (indexData == -1 && indexIn == -1) {
        return ""
    }

    if (indexData != -1) {
        return args[indexData + 1]
    }

    return fileHandler.read(args[indexIn + 1])
}

private fun getOut(args: Array<String>): String {
    val index = args.indexOf("-out")
    return if (index == -1) "" else args[index + 1]
}
