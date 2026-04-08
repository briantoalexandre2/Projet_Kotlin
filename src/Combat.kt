import kotlin.random.Random
import kotlin.random.nextInt

class Combat(private val joueur1: Joueur, private val joueur2: Joueur) {
    private fun jouerTour(attaquant: Joueur, defenseur: Joueur) {
        var degat: Int
        if (Random.nextInt(1,100)<6) {
            degat = attaquant.attaquer()*2
            defenseur.recevoirDegats(degat)
            println("${attaquant.nom} attaque ${defenseur.nom} (${degat} dégats critique!)\n${defenseur.nom} a ${defenseur.vie} PV")
        } else {
            degat = attaquant.attaquer()
            defenseur.recevoirDegats(degat)
            println("${attaquant.nom} attaque ${defenseur.nom} (${degat} dégats)\n${defenseur.nom} a ${defenseur.vie} PV")
        }
    }
    private fun afficherVainqueur() {
        println("Fin du combat ! ")
        if (this.joueur1.vie == 0) {
            println("${this.joueur2.nom} a gagné !")
        } else if (this.joueur2.vie == 0) {
            println("${this.joueur1.nom} a gagné !")
        } else /*if ((this.joueur1.vie == 0) and (this.joueur2.vie == 0))*/ {
            println("Match Nul !")
        }
    }

    fun lancer() {
        var tour: UByte = 1U
        println("Début du combat entre ${this.joueur1.nom} et ${this.joueur2.nom} !")
        while (tour<50U) {
            println("\n--- Tour $tour ---")
            this.jouerTour(this.joueur1, this.joueur2)
            if (this.joueur2.vie == 0) break
            this.jouerTour(this.joueur2, this.joueur1)
            if (this.joueur1.vie == 0) break
            tour++
        }
    }
}