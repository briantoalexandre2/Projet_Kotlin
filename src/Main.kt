val arme1: Arme = Arme("épée", 15)
val arme2: Arme = Arme("arc", 10)

val j1: Joueur = Joueur("alex", 20, mutableListOf(arme2))
val j2: Joueur = Joueur("alex", 20, arme2,)
val j3: Joueur = Joueur("alex", 20, arme2,mutableListOf(arme2))

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
        println(j1)
        println(j2)
        println(j3)

    }
    etape2()
}