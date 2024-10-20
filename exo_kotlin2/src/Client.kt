class Client(var idClient: String, var nomClient: String, var prenomClient: String)
{
    fun afficheClient()
    {
        println("Informations sur le client")
        println("Identifiant: ${idClient}")
        println("Nom Client: ${nomClient}")
        println("Prenom: ${prenomClient}")

    }
}