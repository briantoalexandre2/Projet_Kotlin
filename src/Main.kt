val arme1: Epee = Epee()
val arme2: Baton = Baton()

val g1: Guerrier = Guerrier("Arthur", 150, 5, arme1)
val m1: Mage = Mage("Merlin", 150, 20, arme2)

val combat1: Combat = Combat(g1, m1)

fun main() {
    println(g1)
    println(m1)
    combat1.lancer()
}
