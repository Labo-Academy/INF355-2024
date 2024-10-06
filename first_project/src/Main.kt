//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

fun String.salutation(): String {
    return "Bonjour"
}

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
    var int: Int = 3            // 4 Oc
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

    // Concaténation
    val str = "Test" + " 1"
    val str2 = "Je fais : $str"
    val str3 = "Taille de str2: ${str.length}"

    val phrase = """Bonjour,
        |Je suis Wilfried Okono.
        |Dev Web et Mobile (Laravel, Vuejs, Reactjs et Flutter)
    """.trimMargin()

    println(phrase)

    val str4 = "Douala"
    val str5 = "Duala"

    println("str4[0] = ${str4.get(0)}")

    println("str4[0] = ${str4[0]}")


    println("str4 == str5 ? ${str4.equals(str5)}")

    println("str4 == str5 ? ${str4 == str5}")


    // Substring
    val nomComplet = "Wilfried Okono"

    println("Prénom = ${nomComplet.subSequence(0,8)}")
    // Prénom = Wilfried
    println("okono exist ? ${nomComplet.contains("okono")}")
    //okono exist ? false
    println("okono exist ? ${nomComplet.contains("okono", true)}")
    //okono exist ? true



    if (int == int2){
       println("Ok")
    }else{
        println("Not Ok")
    }

    val rest = if (int == int3){
        "Equals"
    } else{
        "Not Equals"
    }


    when(int){
        0, 1, 2, 3, 4 -> println("is 4")
        5 -> println("is 5")
        6 -> println("is 6")
        7 -> println("is 7")
        else -> println("orther value")
    }

    val reslt2 = when(int2){
        in 1..4 -> 4.0
        5 -> 5.0
        6 -> 6.0
        7 -> 7.0
        else -> 8.0
    }


    for (i in 1..10 step 2){
        println(i)
    }

    for (index in array.indices){
        println("$index : $index")
    }

    for ((index, value) in array.withIndex()){
        println("$index : $value")
    }

    for ((index, value) in (1..10).withIndex()){
        println("$index : $value")
    }

    while (int != 0){
        int %= 2
        int = 0

    }

    int = 3
    do {
        int--
    }while (int != 0)


    println("Salutation of type String: ${string.salutation()}")


    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!")

    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }


    val somme = {num1: Int, num2: Int -> num1 + num2}
    println("10 + 5 = ${somme(10,5)}")

    val ints = arrayOf(1, 2, 3, 4, 5)
    val ints2 = intArrayOf(1, 2, 3, 4, 5)
    val ints3 = arrayOf<Int>(1, 2, 3, 4, 5)
    val ints4 = Array<Int>(15){elt -> elt + 1}

    ints4.forEach { elt -> print(" $elt") }
    // 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15

    println(ints.get(3))
    println(ints[3])
    // 4
    ints.contains(4)
    ints.set(3, 15)
    ints[3] = 15
    println(ints[3])
    // 15



}

fun salutation(): Unit {
    println("Bonjour")
}

fun salutation2(name: String, age: Int = 100): String {
    return if (age > 20){
        "Bonjour grand $name"
    } else {
        "Bonjour petit $name"
    }
}











