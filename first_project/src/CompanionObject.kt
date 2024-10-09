class CompanionObject {
    companion object {
        fun sayHello() {
            println("Hello from companion object!")
        }

        val CONSTANT = 42
    }
}

fun main() {
    CompanionObject.sayHello()  // Affiche: Hello from companion object!
    println(CompanionObject.CONSTANT)  // Affiche: 42
}