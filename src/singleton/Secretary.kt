package singleton

class Secretary {
    fun requestSignature(document: String) {
        println("\n[Secretary] Bringing the document '$document' to the President...")
        President.signBill(document)
    }
}
