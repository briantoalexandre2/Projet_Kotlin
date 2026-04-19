val arme1: Arme = Arme("épée", 50)
val arme4: Arme = Arme("Baton", 45)

val g1: Guerrier = Guerrier("Arthur")
val m1: Mage = Mage("Merlin")

val combat1: Combat = Combat(g1, m1)

fun main() {
    println(g1)
    println(m1)
    combat1.lancer()
}