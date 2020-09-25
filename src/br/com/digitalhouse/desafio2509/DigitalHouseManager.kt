package br.com.digitalhouse.desafio2509

class DigitalHouseManager (val listaDeAlunos: List<Aluno>,
                           val listaDeProfessores: List<Professor>,
                           val listaDeCursos: List<Curso>,
                           val listaDeMatriculas: List<Matricula>) {

    fun registrarCurso(nome: String,
                       codigoCurso: Int,
                       quantidadeMaximaDeAlunos: Int){

    }

    fun excluirCurso(codigoCurso: Integer){

    }
    fun registrarProfessorTitular(nome: String,
                                  sobrenome: String,
                                  codigoProfessor: Int,
                                  especialidade: String){

    }

    fun registrarProfessorAdjunto(nome: String,
                                  sobrenome: String,
                                  codigoProfessor: Int,
                                  monitoria: Int){

    }

    fun excluirProfessor(codigoProfessor: Int){

    }

    fun matricularAluno(nome: String,
                        sobrenome: String,
                        codigoAluno:Int){

    }

    fun matricularCurso (codigoAluno: Int,
                         codigoCurso: Int){

    }

    fun alocarProfessores(codigoCurso: Int,
                          codigoProfessorTitular:  Int,
                          codigoProfessorAdjunto:Int){
        
    }
}