package br.com.digitalhouse.desafio2509

class Aluno (val nome: String,
             val sobrenome: String,
             val codigoAluno: Int) {

    override fun equals(other: Any?): Boolean {
        if (other == null || other != codigoAluno) {return true}
        return false
    }

}