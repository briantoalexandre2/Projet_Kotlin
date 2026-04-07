class Arme(val nom: String, degat: Int) {
    var degat: Int = degat
        set(value) {
            if (value>0) {
                println("Modification des dégâts de l'arme ${this.nom}")
                field = this.degat
            }
            else {
                println("Valeur Invalide pour les dégats")
            }
        }



    override fun toString(): String {
        return "($nom, $degat)"
    }
}