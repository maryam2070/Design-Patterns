package singleton

fun main() {
    println("--- Singleton Pattern Demonstration ---")

    val spokesperson = Spokesperson()
    val secretary = Secretary()
    val advisor = Advisor()

    spokesperson.announceSpeech()
    secretary.requestSignature("Clean Energy Act")
    secretary.requestSignature("Education Reform")
    advisor.suggestAction("Strategic Defense Initiative")
}
