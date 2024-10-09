interface Clickable {
    fun click()
    fun show() {
        println("I'm clickable!")
    }
}

class Button : Clickable {
    override fun click() {
        println("Button clicked!")
    }
}

fun main() {
    val button = Button()
    button.click()  // Affiche: Button clicked!
    button.show()   // Affiche: I'm clickable!
}


