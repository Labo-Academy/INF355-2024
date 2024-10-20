open class Produit(var nomProd: String, var prixU: Double, var qte: Int)
{

    // affiche infos produit
    open fun afficheProduit()
    {
        println("Les informations du produit sont:")
        println("Nom du Produit: $nomProd")
        println("Prix Unitairet: $prixU")
        println("Qte en stock: $qte")
    }

}