package builder

/**
 * Generic builder contract (GoF-style).
 */
interface Builder<T> {
    fun build(): T
}

