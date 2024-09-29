//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    // Ceci est un commentaire sur une ligne
    // println("Hello Kotlin")

    /*
     * Ceci est un commentaire
     * val name = "Kotlin"
     */

    val name: String = "Kotlin"
    var age: Int = 18

    println("Nom :, " + name)
    println("Age :, " + age)

    //name = "Java"
    age = 19


    val byte: Byte = 1          // 1 Oc
    val short: Short = 2        // 2 Oc
    val int: Int = 3            // 4 Oc
    val long: Long = 4L         // 8 Oc

    val float: Float = 3.0f     // 4 Oc
    val double: Double = 5.0    // 8 Oc

    println("La valeur max d'un Int est : " + Int.MAX_VALUE)
    // La valeur max d'un Int est : 2147483647
    println("La valeur min d'un Int est : " + Int.MIN_VALUE)
    // La valeur min d'un Int est : -2147483648

    val float2 = 3.0f
    val double2 = 100.0
    val int2 = 3
    println("Le type de float2 est : " + float2::class)
    // Le type de float2 est : float (Kotlin reflection is not available)
    println("Le type de double2 est : " + double2::class.simpleName)
    // Le type de double2 est : Double


    // Les types sont colorés en gris parce que Kotlin peut les determinés


    val char: Char = 'c'
    val string: String = "Kotlin"

    val bool: Boolean = true

    val array: Array<String> = arrayOf("a", "b", "c", "d", "e", "f", "g", "h")

    val int3: Int = double.toInt()
    // val long3: Long = int3
    //val double3: Double = float

    val long4: Long = 100000000000000000L
    val int4: Int = long4.toInt()
    println("int4 = " + int4) // Concatenation
    println("int4 = $int4") // Template
    // int4 = 1569325056

    val int5 = 100
    val char2 = int5.toChar()
    println("char2 = $char2")
    // char2 = d




    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!")

    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }
}