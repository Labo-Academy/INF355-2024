data class Personne(var name: String, var age: Int) {
}
fun main(args: Array<String>) {
    val person1 = Personne("John", 18)
    val person2 = Personne("John", 18)

    println("person1 == person2 = ${person1 == person2}")
    // person1 == person2 = true

    val person3 = person1.copy()
    println("person3 : $person3")
    // person3 : Personne(name=John, age=18)

    val person4 = person1.copy(name = "Toto")
    println("person4 : $person4")
    // person4 : Personne(name=Toto, age=18)

    println("hashCode : preson1 => ${person1.hashCode()} , preson2 => ${person2.hashCode()}")
    // hashCode : preson1 => 71750727 , preson2 => 71750727

    println("person1.name = ${person1.component1()}")
    // person1.name = John
    println("person1.age = ${person1.component2()}")
    //person1.age = 18
}