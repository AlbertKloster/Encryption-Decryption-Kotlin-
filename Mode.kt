package encryptdecrypt

enum class Mode(val mode: String) {
    ENC("enc"), DEC("dec");

    companion object {
        fun getMode(input: String): Mode {
            for (mode in Mode.values()) {
                if (mode.mode == input.lowercase()) {
                    return mode
                }
            }
            throw RuntimeException("Wrong mode!")
        }
    }
}