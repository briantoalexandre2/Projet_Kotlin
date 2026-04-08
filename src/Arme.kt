class Arme(val nom: String, degat: Int) {
    var degat: Int = degat
        set(value) {
            if (value>0) {
                println("Modification des dégâts de l'arme ${this.nom}")
                field = value
            }
            else {
                println("Valeur Invalide pour les dégats")
            }
        }
        get() {if (field<0) return 1 else return field}



    override fun toString(): String {
        return "($nom, $degat)"
    }
}