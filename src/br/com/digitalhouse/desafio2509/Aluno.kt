package br.com.digitalhouse.desafio2509

class Aluno (val nome: String,
             val sobrenome: String,
             val codigoAluno: Int) {

    init {
        println("Aluno $nome $sobrenome foi cadastrado na escola com o Codigo de Aluno $codigoAluno")
    }

    override fun equals(other: Any?): Boolean {
        if (other == null || other != codigoAluno) {return true}
        return false
    }

}