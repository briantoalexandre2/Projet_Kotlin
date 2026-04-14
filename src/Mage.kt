class Mage(nom: String, vie: Int, var mana: Int, armeEquipee: Arme, inventaire: MutableList<Arme> = mutableListOf(Arme("Poing", 5))): Personnage(nom, vie, armeEquipee, inventaire) {
    constructor(nom: String, vie: Int, mana: Int, inventaire: MutableList<Arme> = mutableListOf()): this(nom, vie, mana, armeEquipee = Arme("Poing", 5), inventaire) {
    }
    constructor(nom: String): this(nom, 100, 20, Arme("Baton", 20))

    private fun lancerSort() {
        this.mana -= 10
    }

    override fun attaquer(): Int {
        this.lancerSort()
        if (this.mana>=10) {
            return this.armeEquipee.degat*2
        } else {
            return this.armeEquipee.degat
        }
    }
    override fun messageAttaque(defenseur: Personnage, degat: Int) {
        if (this.mana>=10) {
            this.lancerSort()
            println("${this.nom} lance un sort sur ${defenseur.nom} infligeant ($degat dégâts) (${this.mana} mana restant)\n${defenseur.nom} a ${defenseur.vie} PV")
        } else {
            println("${this.nom} n'a pas assez de mana, ${this.nom} attaque ${defenseur.nom} avec ${this.armeEquipee.nom} (${degat} dégats)\n${defenseur.nom} a ${defenseur.vie} PV")
        }
    }
    override fun toString(): String {
        return "($nom, vie=$vie, mana=$mana, armeEquipee=$armeEquipee, inventaire=$inventaire)"
    }
}