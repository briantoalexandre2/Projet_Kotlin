open class Personnage(val nom: String, vie: Int, attaque: Int) {
    var vie: Int = vie
        get() {if (field<0) return 0 else return field}
    val attaque: Int = attaque
        get() {if (field<0) return 0 else return field}

    fun subirDegats(degats: Int) {
        val vie: Int = this.vie - (degats)
        if (vie > 0) this.vie = vie else this.vie = 0

    }
    fun attaquer(cible: Personnage) {
        if (cible.vie > 0) {
            println("${this.nom} attaque ${cible.nom} et inflige ${this.attaque} dégâts")
            subirDegats(this.attaque)
            println("${cible.nom} perd ${this.attaque} points de vie (vie restante : ${cible.vie})
        } else {
            println("${this.nom} ne peut pas attaquer (KO)")

        }
    }
    fun afficherEtat() {
        println("Nom : ${this.nom} | Vie : ${this.vie} | Attaque : ${this.attaque}")
    }
}