package br.com.digitalhouse.desafio2509

import javax.swing.GroupLayout

class Curso (val nome: String,
             val codigoCurso: Int,
             val qtdMaximaAlunos: Int) {

    val alunos: MutableSet<Aluno> = mutableSetOf()
//    val professorTitular: ProfessorTitular
//    val professorAdjunto: ProfessorAdjunto

    init{
        println("Cadastrado o curso $nome com o Codigo $codigoCurso")
    }

    override fun equals(other: Any?): Boolean {
        if (other == null || other != codigoCurso) {return true}
        return false
    }

    fun adicionarAluno (aluno: Aluno): Boolean {
        if (qtdMaximaAlunos == alunos.size) {
            println("Não é possivel adicionar aluno")
            return false
        } else {
            println("Aluno cadastrado")
            alunos.add(aluno)
            return true
        }
    }

    fun excluirAluno (aluno: Aluno) {
        if (alunos.contains(aluno)){
            alunos.remove(aluno)
            println("Aluno removido")
        } else {
            println("Aluno não matriculado")
        }
    }
}