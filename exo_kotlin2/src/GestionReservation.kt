class GestionReservation
{
    var tabChambre = mutableListOf<Chambre>()
    var tabReservation = mutableListOf<Reservation>()
    fun ajouterChambre(chambre: Chambre)
    {
        tabChambre.add(chambre)
    }
    fun afficheChambreDispo()
    {
        tabChambre.filter{!it.etatChambre}.forEach{it.afficheChambre()}
    }

    fun reserverChambre(client: Client, numChambre: Int, dureeSejour: Int)
    {
        var maChambre = tabChambre.find { it.numChambre == numChambre} ?: throw Exception("Chambre non trouvée!")
        maChambre.reserver()
        tabReservation.add(Reservation(client, maChambre, dureeSejour))
    }

    fun annulerReservation(numChambre: Int)
    {
        var deleteReservation = tabReservation.find { it.chambre.numChambre == numChambre } ?: throw Exception("Aucune reservation à ce numéro!")
        deleteReservation.chambre.etatChambre = false
        tabReservation.remove(deleteReservation)
    }

    fun afficheReservationEffectuees()
    {
        println("Les informations sur les reservations sont:")
        tabReservation.forEach {it.afficheReservation()}

    }
}