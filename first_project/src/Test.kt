
fun main(args: Array<String>) {
    var note: Int = 12
    var i: Int = 0
    val appreciation = if (note >= 10){
        while (note < 15){
            note++
            i++
        }
        "pass"
    }else{
        while (note != 0){
            note--
            i--
        }
        "lose"
    }
    println("$appreciation - i= $i")
}