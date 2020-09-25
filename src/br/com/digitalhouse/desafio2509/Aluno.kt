package br.com.digitalhouse.desafio2509

class Aluno (val nome: String, val sobrenome: String, val codigo: Int) {

    override fun equals(other: Any?): Boolean {
        if (other == null || other != codigo) {return true}
        return false
    }
}