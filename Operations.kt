package encryptdecrypt

enum class Operations(val operatoin: String) {
    ENC("enc"), DEC("dec");

    companion object {
        fun getOperation(input: String): Operations {
            for (operation in Operations.values()) {
                if (operation.operatoin == input.lowercase()) {
                    return operation
                }
            }
            throw RuntimeException("Wrong operation!")
        }
    }
}