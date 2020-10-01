package br.com.digitalhouse.desafio2509

class DigitalHouseManager () {

    var listaDeAlunos: MutableMap<Int, List<String>> = mutableMapOf()
    var listaDeProfessores: MutableMap<Int, List<String>> = mutableMapOf()
    var listaDeCursos: MutableMap<Int, List<String>> = mutableMapOf()
    var listaDeMatriculas: MutableMap<Int, String> = mutableMapOf()

    fun registrarCurso(nome: String ,
                       codigoCurso: Int,
                       qtdMaximaAlunos: Int)  {
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
                         codigoCurso: Int) {
        var cont = 1
        var a: Curso? = null
        if (listaDeAlunos.containsKey(codigoAluno) && listaDeCursos.containsKey(codigoCurso)) {
            for (a in listaDeMatriculas.keys) {
                cont++
                println(cont)
            }
            if (cont <= listaDeCursos[codigoCurso]!![1].toInt()) {
                listaDeMatriculas.put(codigoCurso, "Aluno $codigoAluno ${listaDeAlunos[codigoAluno]!![0]} matriculado no curso ${listaDeCursos[codigoCurso]!![0]}")
            } else {
                println("nao foi possivel matricular pois o curso esta lotado")
            }
        } else {
            println("aluno e/ou curso nao localizados")
        }
    }

    fun alocarProfessores(codigoCurso: Int,
                          codigoProfessorTitular:  Int,
                          codigoProfessorAdjunto: Int){
        if (listaDeProfessores.containsKey(codigoProfessorAdjunto) && listaDeProfessores.containsKey(codigoProfessorTitular)){
            listaDeCursos[codigoCurso] = listOf(listaDeCursos[codigoCurso]!![0], listaDeCursos[codigoCurso]!![1], "Professor ${listaDeProfessores[codigoProfessorAdjunto]!![1]}(Adjunto)", "Professor ${listaDeProfessores[codigoProfessorTitular]!![1]} (Titular)")
        } else {
            println("professores nao localizados")
        }
    }
}