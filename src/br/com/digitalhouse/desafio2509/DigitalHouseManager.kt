package br.com.digitalhouse.desafio2509

class DigitalHouseManager () {

    var listaDeAlunos: MutableMap<Int, List<String>> = mutableMapOf()
    var listaDeProfessores: MutableMap<Int, List<String>> = mutableMapOf()
    var listaDeCursos: MutableMap<Int, List<String>> = mutableMapOf()
    var listaDeMatriculas: MutableList<String> = mutableListOf()

    fun registrarCurso(nome: String,
                       codigoCurso: Int,
                       qtdMaximaAlunos: Int){
        listaDeCursos.put(codigoCurso, listOf(nome, "$qtdMaximaAlunos"))
        println("curso cadastrado")
    }

    fun excluirCurso(codigoCurso: Int){
        if (listaDeCursos.containsKey(codigoCurso)){
            listaDeCursos.remove(codigoCurso)
            println("curso removido")
        }
        else {
            println("curso nao cadastrado")
        }
    }

    fun registrarProfessorTitular(nome: String,
                                  sobrenome: String,
                                  codigoProfessor: Int,
                                  especialidade: String){

        listaDeProfessores.put(codigoProfessor, listOf(nome,sobrenome,"Professor Titular $especialidade"))
        println("professor titular cadastrado")
    }

    fun registrarProfessorAdjunto(nome: String,
                                  sobrenome: String,
                                  codigoProfessor: Int,
                                  monitoria: Int){
        listaDeProfessores.put(codigoProfessor, listOf(nome, sobrenome, "Professor Adjunto monitoria $monitoria horas"))
        println("professor adjunto cadastrado")
    }

    fun excluirProfessor(codigoProfessor: Int){
        if (listaDeProfessores.containsKey(codigoProfessor)){
            listaDeProfessores.remove(codigoProfessor)
            println("professor removido")
        }
        else {
            println("professor nao cadastrado")
        }
    }

    fun matricularAluno(nome: String,
                        sobrenome: String,
                        codigoAluno: Int){
        listaDeAlunos.put(codigoAluno, listOf(nome, sobrenome))
        println("aluno cadastrado")
        println(listaDeAlunos)
    }

    fun matricularCurso (codigoAluno: Int,
                         codigoCurso: Int){
        if (listaDeAlunos.containsKey(codigoAluno) && listaDeCursos.containsKey(codigoCurso)){
            println("Aluno e Curso encontrado")
            if ((listaDeCursos[codigoCurso]!!.get(1)).toInt() > listaDeMatriculas.size){
                println("aluno matriculado")
                listaDeMatriculas.add("$codigoAluno matriculado em $codigoCurso")
            } else {
                println("nao é possivel matricular devido a quantidade maxima de alunos")
            }
        } else {
            println("aluno e/ou curso nao encontrados")
        }
    }

    fun alocarProfessores(codigoCurso: Int,
                          codigoProfessorTitular:  Int,
                          codigoProfessorAdjunto: Int){
 
    }
}