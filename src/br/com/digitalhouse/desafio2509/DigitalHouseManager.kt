package br.com.digitalhouse.desafio2509


class DigitalHouseManager () {

    var listaDeAlunos: MutableList<Aluno> = mutableListOf()
    var listaDeProfessores: MutableList<Professor> = mutableListOf()
    var listaDeCursos: MutableList<Curso> = mutableListOf()
    var listaDeMatriculas: MutableList<Matricula> = mutableListOf()

    fun registrarCurso(nome: String ,
                       codigoCurso: Int,
                       qtdMaximaAlunos: Int)  {
        var curso = Curso (nome, codigoCurso, qtdMaximaAlunos)
        listaDeCursos.add(curso)
        println("curso ${curso.nome} cadastrado")
    }

    fun excluirCurso(codigoCurso: Int){
        var cursoRemove: Curso? = null
        for (curso in listaDeCursos){
            if (curso.codigoCurso == codigoCurso){
                cursoRemove = curso
                println("removido o curso ${cursoRemove.nome}")
            }
        }
        listaDeCursos.remove(cursoRemove)
    }

    fun registrarProfessorTitular(nome: String,
                                  sobrenome: String,
                                  codigoProfessor: Int,
                                  especialidade: String){

        var professorTitular: ProfessorTitular = ProfessorTitular(nome,sobrenome, tempoCasa = 0, codigoProfessor, especialidade)
        listaDeProfessores.add (professorTitular)
        println("professor $sobrenome cadastrado como titular")
    }

    fun registrarProfessorAdjunto(nome: String,
                                  sobrenome: String,
                                  codigoProfessor: Int,
                                  monitoria: Int){
        var professorAdjunto: ProfessorAdjunto = ProfessorAdjunto(nome,sobrenome, tempoCasa = 0, codigoProfessor, monitoria)
        listaDeProfessores.add (professorAdjunto)
        println("professor $sobrenome cadastrado como adjunto")
    }

    fun excluirProfessor(codigoProfessor: Int){
        var professorRemove: Professor? = null
        for (professor in listaDeProfessores){
            if (professor.codigoProfessor == codigoProfessor){
                professorRemove = professor
                println("removido o professor ${professorRemove.sobrenome}")
            }
        }
        listaDeProfessores.remove(professorRemove)
    }

    fun matricularAluno(nome: String,
                        sobrenome: String,
                        codigoAluno: Int){
        var aluno = Aluno (nome, sobrenome, codigoAluno)
        listaDeAlunos.add(aluno)
        println("aluno ${aluno.nome} ${aluno.sobrenome} matriculado na escola pelo RA ${aluno.codigoAluno}")
    }

    fun matricularCurso (codigoAluno: Int,
                         codigoCurso: Int) {

        var matriculaAluno: Aluno? = null
        var matriculaCurso: Curso? = null
        var quantidade = 1

        for (aluno in listaDeAlunos) {
            if (aluno.codigoAluno == codigoAluno) {
                matriculaAluno = aluno
                println("aluno ${aluno.nome} ${aluno.sobrenome} localizado")
            }
        }

        for (curso in listaDeCursos) {
            if (curso.codigoCurso == codigoCurso) {
                matriculaCurso = curso
                println("curso ${curso.nome} localizado")
            }
        }

        for (qtd in listaDeMatriculas){
            if(qtd.curso.codigoCurso == codigoCurso) {
                quantidade++
            }
        }

        if (quantidade <= matriculaCurso!!.qtdMaximaAlunos){
            var matricula = Matricula(matriculaAluno!!, matriculaCurso!!, "Hoje")
            listaDeMatriculas.add(matricula)
            println("matricula realizada: ${matriculaAluno.nome} - ${matriculaCurso.nome}")
        } else {
            println("matricula nao realizada")
        }
    }

/*
    fun alocarProfessores(codigoCurso: Int,
                          codigoProfessorTitular:  Int,
                          codigoProfessorAdjunto: Int){
        if (listaDeProfessores.containsKey(codigoProfessorAdjunto) && listaDeProfessores.containsKey(codigoProfessorTitular)){
            listaDeCursos[codigoCurso] = listOf(listaDeCursos[codigoCurso]!![0], listaDeCursos[codigoCurso]!![1], "Professor ${listaDeProfessores[codigoProfessorAdjunto]!![1]}(Adjunto)", "Professor ${listaDeProfessores[codigoProfessorTitular]!![1]} (Titular)")
        } else {
            println("professores nao localizados")
        }
    }*/
}