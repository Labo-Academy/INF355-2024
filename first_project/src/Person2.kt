class Person2 constructor(name: String, age: Int) {
    var _name: String = name
    var _age: Int
    init {;
        _age = age + 1
    }
}




fun main(args: Array<String>) {
    val person = Person2("Jack", 18)
}