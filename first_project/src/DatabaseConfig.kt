object DatabaseConfig {
    val url = "jdbc:mysql://localhost:3306/mydb"
    val user = "admin"
    val password = "password"

    fun connect() {
        println("Connecting to the database...")
    }
}

fun main() {
    println(DatabaseConfig.url)
    DatabaseConfig.connect()
}