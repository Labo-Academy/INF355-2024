open class Person3(protected var nom: String, protected var age: Int) {
    fun eat(){
        println("$nom $age - eat")
    }
    open fun walk(){
        println("$nom $age - walk")
    }
}

class Student(nom: String, age: Int) : Person3(nom, age) {
    private fun learn(){
        println("Learn")
    }
}

class Teacher(nom: String, age: Int, private var salary: Double) : Person3(nom, age) {

    private fun teach(){
        println("Teacher")
    }
     override fun walk() {
        println("$nom $age $salary - walk - Teacher")
    }
}

fun main(args: Array<String>) {
    val person = Teacher("Adam", 18,20000.0 )
    person.walk()
}