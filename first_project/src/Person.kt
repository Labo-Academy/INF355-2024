open class Person(var name : String, protected var age: Int) {
    constructor(name: String) : this(name, 0)
    constructor(): this("Toto")

    fun salution() {
        println("$name vous dit bonjour")
    }
}

fun main(args: Array<String>) {
    var person = Etudiant(  "Test", 15, 15.0)
    person.salution()
}
