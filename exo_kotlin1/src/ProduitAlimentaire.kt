import java.time.LocalDate
import java.util.Date

class ProduitAlimentaire(nomProd : String, prixU: Double, qte: Int, var datePeremtion: LocalDate): Produit(nomProd, prixU, qte)
{

    fun ifPerime(): Boolean
    {
        return LocalDate.now().isAfter(datePeremtion)
    }
    override fun afficheProduit()
    {
        super.afficheProduit()
       println("La date de peremtion est: le $datePeremtion")

    }


}