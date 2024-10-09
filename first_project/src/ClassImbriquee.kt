class ClassExterieure {
    var name: String = "Toto"

    class ClassImbriquee{
        var age: Int = 15

        fun afficher(){
//            println("$name $age") Error
        }
    }
}

fun main(args: Array<String>) {
    val classImbriquee = ClassExterieure.ClassImbriquee()
}