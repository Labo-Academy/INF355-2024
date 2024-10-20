class Reservation(var client: Client, var chambre: Chambre, var dureeSejour: Int)
{
    fun afficheReservation()
    {
        client.afficheClient()
        chambre.afficheChambre()
        println("La duree du Sejour est ${dureeSejour}")
    }
}