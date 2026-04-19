class Guerrier(nom: String, vie: Int, var armure: Int, armeEquipee: Arme, inventaire: MutableList<Arme> = mutableListOf(Arme("Poing", 5))): Personnage(nom, vie, armeEquipee, inventaire) {
    constructor(nom: String, vie: Int, armure: Int, inventaire: MutableList<Arme> = mutableListOf() ): this(nom, vie, armure, armeEquipee = Arme("Poing", 5), inventaire) {
    }
    constructor(nom: String): this(nom, 100, 5)

    override fun recevoirDegats(degat: Int) {
        var vDegat = degat-this.armure
        if (vDegat<1) vDegat = 1
        val vie: Int = this.vie - (vDegat)
        if (vie > 0) this.vie = vie else this.vie = 0
    }
    override fun toString(): String {
        return "($nom, vie=$vie, armure=$armure, armeEquipee=$armeEquipee, inventaire=$inventaire)"
    }


}