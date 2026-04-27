package singleton

class Spokesperson {
    fun announceSpeech() {
        println("\n[Spokesperson] Preparing the press for the President...")
        President.giveSpeech()
    }
}
