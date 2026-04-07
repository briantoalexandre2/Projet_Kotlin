class Joueur(val nom: String, var vie: Int, var armeEquipee: Arme, inventaire: MutableList<Arme> = mutableListOf(Arme("Poing", 5))) {
    var inventaire = inventaire
    constructor(nom: String, vie: Int, inventaire: MutableList<Arme> ): this(nom, vie, armeEquipee = Arme("Poing", 5), inventaire) {
        this.vie = vie
        this.armeEquipee = armeEquipee
        this.inventaire = inventaire

    }

    fun attaquer(): Int {return this.armeEquipee.degat}
    fun recevoirDegats(degat: Int): Unit {if (this.vie>0) this.vie-=degat}
    fun ajouterArme(arme: Arme): Unit {this.inventaire.add(arme)}
    fun changerArme(nomArme: String): Unit {
        val arme = this.inventaire.find {it.nom.lowercase() == nomArme.lowercase()}
        if (arme != null) {

            this.inventaire.add(this.armeEquipee)
            this.inventaire.remove(arme)
            this.armeEquipee = arme
            println("${this.nom} a équipé ${this.armeEquipee}")
        } else {println("Arme non trouvée dans l'inventaire")}
    }
    fun afficherInventaire(): Unit {this.inventaire.forEach { println(it) }}

    override fun toString(): String {
        return "($nom, vie=$vie, armeEquipee=$armeEquipee, inventaire=$inventaire)"
    }

}