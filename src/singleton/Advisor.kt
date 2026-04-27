package singleton

class Advisor {
    fun suggestAction(action: String) {
        println("\n[Advisor] Presenting options for: $action")
        President.authorizeAction(action)
    }
}
