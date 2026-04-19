open class Personnage(val nom: String, vie: Int, open var armeEquipee: Arme, inventaire: MutableList<Arme> = mutableListOf(Arme("Poing", 5))) {
    var vie: Int = vie
        get() {if (field<0) return 0 else return field}
    open var inventaire = inventaire
        get() = field.distinct().toMutableList()
    constructor(nom: String, vie: Int, inventaire: MutableList<Arme> = mutableListOf()): this(nom, vie, armeEquipee = Arme("Poing", 5), inventaire) {
        this.vie = vie
        this.armeEquipee = armeEquipee
        this.inventaire = inventaire
    }
    open fun attaquer(): Int {return this.armeEquipee.degat}

    open fun recevoirDegats(degat: Int): Unit {
        val vie: Int = this.vie - (degat)
        if (vie < 0) this.vie = 0 else this.vie = vie
    }

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

    open fun messageAttaque(defenseur: Personnage, degat: Int) {
        println("${this.nom} attaque ${defenseur.nom} (${degat} dégats)\n${defenseur.nom} a ${defenseur.vie} PV")
    }

    override fun toString(): String {
        return "($nom, vie=$vie, armeEquipee=$armeEquipee, inventaire=$inventaire)"
    }

}