interface Shape {
    val area: Double
    fun draw()
}

class Circle(val radius: Double) : Shape {
    override val area: Double
        get() = Math.PI * radius * radius

    override fun draw() {
        println("Drawing a circle")
    }
}
