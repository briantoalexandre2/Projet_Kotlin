import kotlin.random.Random

class Combat(private val personnage1: Personnage, private val personnage2: Personnage) {
    private fun jouerTour(attaquant: Personnage, defenseur: Personnage) {
        var degat: Int
        if (Random.nextInt(1,100)<6) {
            println("coup critique !")
            degat = attaquant.attaquer()*2
            defenseur.recevoirDegats(degat)
            attaquant.messageAttaque(defenseur, degat)
        } else {
            degat = attaquant.attaquer()
            defenseur.recevoirDegats(degat)
            attaquant.messageAttaque(defenseur, degat)
        }
    }
    private fun afficherVainqueur() {
        println("Fin du combat ! ")
        if (this.personnage1.vie == 0) {
            println("${this.personnage2.nom} a gagné !")
        } else if (this.personnage2.vie == 0) {
            println("${this.personnage1.nom} a gagné !")
        } else /*if ((this.joueur1.vie == 0) and (this.joueur2.vie == 0))*/ {
            println("Match Nul !")
        }
    }

    fun lancer() {
        var tour: UByte = 1U
        println("Début du combat entre ${this.personnage1.nom} et ${this.personnage2.nom} !")
        while (tour<50U) {
            println("\n--- Tour $tour ---")
            this.jouerTour(this.personnage1, this.personnage2)
            if (this.personnage2.vie == 0) break
            this.jouerTour(this.personnage2, this.personnage1)
            if (this.personnage1.vie == 0) break
            tour++
        }
    }
}