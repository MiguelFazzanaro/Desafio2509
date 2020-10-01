package br.com.digitalhouse.desafio2509

class Curso(val nome: String,
                 val codigoCurso: Int,
                 val qtdMaximaAlunos: Int) {

    var alunos: MutableSet<Aluno> = mutableSetOf()

    init{
        println("Cadastrado o curso $nome com o Codigo $codigoCurso")
    }

    override fun equals(other: Any?): Boolean {
        if (other == null || other != codigoCurso) {return true}
        return false
    }

    fun adicionarAluno (aluno: Aluno): Boolean {
        if (alunos.size >= qtdMaximaAlunos) {
            println("Não é possivel adicionar aluno")
            println(alunos)
            return false
        } else {
            println("Aluno ${aluno.nome} cadastrado no curso ${this.nome}")
            alunos.add(aluno)
            println(alunos)
            return true
        }
    }

    fun excluirAluno (aluno: Aluno) {
        if (alunos.contains(aluno)){
            alunos.remove(aluno)
            println("Aluno ${aluno.nome} removido do curso de ${this.nome}")
        } else {
            println("Aluno não matriculado")
        }
    }
}