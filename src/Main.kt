val arme1: Arme = Arme("épée", 50)
val arme2: Arme = Arme("Arc", 12)
val arme3: Arme = Arme("Hache", 20)
val arme4: Arme = Arme("Baton", 45 )

val g1: Guerrier = Guerrier("Arthur", 150, 20)
val m1: Mage = Mage("Merlin", 150, 20, arme4)

val t1: Guerrier = Guerrier("a", 20, 20, arme1)
val t2: Guerrier = Guerrier("b", 20, 20, mutableListOf(arme2))

val combat1: Combat = Combat(g1, m1)

fun main() {
    println(g1)
    println(m1)
    combat1.lancer()
}