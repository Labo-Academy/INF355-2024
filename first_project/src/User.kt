class User(val name: String, val age: Int) {
    companion object Factory {
        fun create(name: String): User {
            return User(name, 18) // Par défaut, on donne l'âge 18 à tous les nouveaux utilisateurs
        }
    }
}

fun main() {
    val user = User.Factory.create("Alice") // Pas obligatoire d'utiliser le nom (Factory)
    println("Nom: ${user.name}, Âge: ${user.age}")  // Affiche: Nom: Alice, Âge: 18
}
