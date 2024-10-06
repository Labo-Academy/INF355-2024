class Person(var name : String, protected var age: Int) {

    var email: String = ""
        get() = field
        set(value) {field = "Email : $value" }

    constructor(name: String, age: Int, email: String, ) : this(name, age){
        this.email = email
    }
    constructor(name: String) : this(name, 0)
    constructor(): this("Toto")

    fun salution() {
        println("$name vous dit bonjour")
    }
}

fun main(args: Array<String>) {
    val person = Person(  )
    val person2 = Person( "William Shakespeare" , 1, "test@example.com" )
    person.salution()
    println(person2.email)
}
