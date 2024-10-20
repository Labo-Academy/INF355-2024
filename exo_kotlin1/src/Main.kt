import java.time.LocalDate
import kotlin.system.exitProcess

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main()
{
    var prod1 = Produit("Dolac", 5000.0, 5)
    var prod2 = Produit("Nido", 15000.0, 5)
    var tabProd = mutableListOf<Produit>()
    var choix  = 0
    do
    {
        println("Le menu")
        println("1. ajouter un produit à l’inventaire")
        println("2. supprimer un produit de l’inventaire")
        println("3. afficher la liste des produits")
        println("4. vérifier si un produit alimentaire est périmé")
        println("5. Quitter")
        println("\n \n \t \t Entrez votre choix")
        choix = readLine()?.toIntOrNull() ?: 0
        when(choix)
        {
            1 ->
                {
                    println("Nom du Produit")
                    var nom = readLine().toString()
                    println("Prix du Produit")
                    var prix = readLine()?.toDoubleOrNull() ?: 0.0
                    println("Quantite du Produit")
                    var qte = readLine()?.toIntOrNull() ?: 0

                    println("Est-ce un produit alimentaire(Oui ou Non)?")
                    var type = readLine()
                    if (type == "Oui" || type == "oui")
                    {
                        println("Date de peremtion(format: yyyy-mm-dd)")
                        var date = LocalDate.parse(readLine())
                        tabProd.add(ProduitAlimentaire(nom, prix, qte, date))
                    }
                    else
                        tabProd.add(Produit(nom, prix, qte))
                }
            2->
                {
                    println("Nom du Produit")
                    var nom = readLine().toString()
                    tabProd.removeIf { it.nomProd == nom }
                }
            3->
                {
                    tabProd.forEach{it.afficheProduit()}
                }
            4->
                {
                    println("Nom du Produit")
                    var nom = readLine().toString()
                    var exist : ProduitAlimentaire? = tabProd.find { it.nomProd == nom && it is ProduitAlimentaire} as? ProduitAlimentaire
                    if (exist?.ifPerime() ?: false)
                        println("Le produit est périmé")
                    else
                        println("Le produit n'est pas périmé")
                }
            5->
                    println("Processus terminé!!!")
            else->
                    println("Entrez un nombre valide!")
        }
    } while (choix != 5)


}