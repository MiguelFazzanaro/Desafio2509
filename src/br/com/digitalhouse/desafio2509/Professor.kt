package br.com.digitalhouse.desafio2509

open class Professor (val nome: String,
                      val sobrenome: String,
                      var tempoCasa: Int,
                      val codigoProfessor: Int) {

    init {
        tempoCasa = 0
        println("Professor $sobrenome foi cadastrado na escola com o codigo de Professor $codigoProfessor")
    }

    override fun equals(other: Any?): Boolean {
        if (other == null || other != codigoProfessor) {
            return true
        }
        return false
    }
}