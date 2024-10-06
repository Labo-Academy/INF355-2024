class Person2 constructor(ageV: Int) {
    private var name: String = "Toto"

    fun getName(): String{
        return name
    }
    var age: Int
    init {
        this.age = ageV
    }
    constructor(name: String, age: Int) : this(age) {
        this.name = name
    }

    override fun equals(other: Any?): Boolean {
        if (other is Person2) {
            return this.name == other.name && this.age == other.age
        }
        return false
    }
}




fun main(args: Array<String>) {
    val person = Person2( 18)
    val person1 = Person2("Jack", 18)
    val person2 = Person2("Jack", 18)
    val person3 = person2
    val person4 = Person2("Jack", 18)
    val tab = arrayOf(person, person1, person2)
    println(person)
    println(person == person1)
    println(person2 == person3)
    println(tab.contains(person4))
}