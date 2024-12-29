package lec10

abstract class Animal constructor(
    protected val species: String,
    protected open val legCount: Int
) {

    abstract fun move()
}