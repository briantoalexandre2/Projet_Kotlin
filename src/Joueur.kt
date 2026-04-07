import kotlin.collections.minusAssign
import kotlin.compareTo

class Joueur(val nom: String, var vie: Int, var armeEquipee: Arme?, inventaire: MutableList<Arme> = mutableListOf()) {
    var inventaire = inventaire
    constructor(nom: String, vie: Int, inventaire: MutableList<Arme> ): this(nom, vie, armeEquipee = null, inventaire) {
        this.vie = vie
        this.armeEquipee = null
        this.inventaire = inventaire

    }

    fun attaquer(): Int {return this.armeEquipee!!.degat}
    fun recevoirDegats(degat: Int) {if (this.vie>0) this.vie-=degat}
    fun ajouterArme(arme: Arme) {this.inventaire.add(arme)}
    fun changerArme(nomArme: String) {
        val boolTest = this.inventaire.find {it.nom == nomArme}
        if (boolTest != null) {
            this.inventaire.add(this.armeEquipee)
        }


    }
    fun afficherInventaire() {}

    override fun toString(): String {
        return "($nom, vie=$vie, armeEquipee=$armeEquipee, inventaire=$inventaire)"
    }

}