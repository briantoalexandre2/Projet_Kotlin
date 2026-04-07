val arme1: Arme = Arme("épée", 15)
val arme2: Arme = Arme("Arc", 12)
val arme3: Arme = Arme("Hache", 20)

val j1: Joueur = Joueur("alex", 20, mutableListOf(arme2, arme1)) /*Test*/
val j2: Joueur = Joueur("Arthur", 50, arme1)
val j3: Joueur = Joueur("Lancelot", 50, mutableListOf())

fun main() {
    fun etape1() {
        println(arme1)
        println(arme2)
        arme2.degat = 12
        println(arme2)
        arme2.degat = -2
        println(arme2)
    }
    fun etape2() {
        /*Artuhr*/
//        println(j2)
//        j2.ajouterArme(arme2)
//        j2.ajouterArme(arme3)
//        j2.afficherInventaire()
//
//        j2.changerArme("Hache")
//        j2.changerArme("Lance")

        /*Lancelot*/
        println(j3)
        j3.ajouterArme(arme2)
        j3.changerArme("Arc")
        println("${j3.nom} est équipé de l'arme : ${j3.armeEquipee}")
        j3.afficherInventaire()
    }
    fun etape3() {
        j2.ajouterArme(arme3)
        j2.changerArme("Hache")
        j3.ajouterArme(arme2)
        j3.changerArme("Arc")

        val c1: Combat = Combat(j2, j3)
        c1.lancer()
    }
    etape3()
}