package br.com.digitalhouse.desafio2509

open class Professor (val nome: String,
                      val sobrenome: String,
                      val tempoCasa: Int,
                      val codigoProfessor: Int) {

    override fun equals(other: Any?): Boolean {
        if (other == null || other != codigoProfessor) {
            return true
        }
        return false
    }
}