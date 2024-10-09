// Classe Parent
open class Animal {
    open fun sound() {
        println("L'animal fait un bruit.")
    }
}

// Classe Enfant qui hérite d'Animal
class Dog : Animal() {
    override fun sound() {
        println("Le chien aboie.")
    }
}

fun main() {
    val myDog = Dog()
    myDog.sound()  // Affiche: Le chien aboie.
}

// Classe Parent avec un constructeur
open class Animal2(val name: String) {
    open fun sound() {
        println("$name fait un bruit.")
    }
}

// Classe Enfant avec un constructeur
class Dog2(name: String) : Animal2(name) {
    override fun sound() {
        println("$name aboie.")
    }
}
