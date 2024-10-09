interface Calculatrice1 {
    var result: Int

    fun somme(a: Int, b: Int): Int {
        return a + b
    }

    fun division(a: Int, b: Int)
}

interface Calculatrice2 {
    fun mult(a: Int, b: Int)
}
interface Calculatrice3: Calculatrice2 {
    fun subtraction(a: Int, b: Int)
}

class Calculatrice(override var result: Int) : Calculatrice1, Calculatrice3 {
    override fun division(a: Int, b: Int) {
        TODO("Not yet implemented")
    }

    override fun mult(a: Int, b: Int) {
        TODO("Not yet implemented")
    }

    override fun subtraction(a: Int, b: Int) {
        TODO("Not yet implemented")
    }
}