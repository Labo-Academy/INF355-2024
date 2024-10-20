class Chambre(var numChambre: Int, var typeChambre: TypeChambre, var prixChambre: Double) : Reservable
{
    var etatChambre : Boolean = false
    fun calculerPrix(sejour: Int): Double
    {
        return sejour*prixChambre
    }
    override fun reserver()
    {
        if(!etatChambre)
            etatChambre = true
        else
           throw Exception("La chambre est déjà reservée!")
    }

    fun afficheChambre()
    {
        println("Informations sur la chambre")
        println("Numero: ${numChambre}")
        println("Type: ${typeChambre}")
        println("Prix: ${prixChambre}")
        println("Etat: ${etatChambre}")
    }
}