class ClassExterieure2 {
    var name: String = "Toto"

    inner class ClassInterieure{
        var age: Int = 15

        fun afficher(){
            println("$name $age")
        }
    }
}

fun main(args: Array<String>) {
    val classInterieure = ClassExterieure2().ClassInterieure()
}