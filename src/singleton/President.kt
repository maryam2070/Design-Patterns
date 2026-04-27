package singleton

/**
 * The President is a Singleton — there can only be one at a time.
 */
object President {
    private var signatureCount = 0
    private val name = "Maryam"

    fun giveSpeech() {
        println("President ($name): \"The state of our union is strong.\"")
    }

    fun signBill(bill: String) {
        signatureCount++
        println("President ($name): Signed '$bill' (Signature #$signatureCount)")
    }

    fun authorizeAction(action: String) {
        println("President ($name): Authorized action: $action")
    }

    /**
     * Helper for testing to reset the state between test cases.
     */
    fun resetForTests() {
        signatureCount = 0
    }
}
