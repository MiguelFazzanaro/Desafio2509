package br.com.digitalhouse.desafio2509

import java.time.LocalDate

class DigitalHouseManager () {

    var listaDeAlunos: MutableList<Aluno> = mutableListOf()
    var listaDeProfessores: MutableList<Professor> = mutableListOf()
    var listaDeCursos: MutableList<Curso> = mutableListOf()
    var listaDeMatriculas: MutableList<Matricula> = mutableListOf()

    fun registrarCurso(nome: String ,
                       codigoCurso: Int,
                       qtdMaximaAlunos: Int)  {
        var cursoAdd = Curso (nome, codigoCurso, qtdMaximaAlunos,null,null)
        listaDeCursos.add(cursoAdd)
        println("Curso ${cursoAdd.nome} cadastrado")
    }

    fun excluirCurso(codigoCurso: Int){
        var cursoRemove: Curso? = null
        for (curso in listaDeCursos){
            if (curso.codigoCurso == codigoCurso){
                cursoRemove = curso
                println("Removido o curso ${cursoRemove.nome}")
            }
        }
        listaDeCursos.remove(cursoRemove)
    }

    fun registrarProfessorTitular(nome: String,
                                  sobrenome: String,
                                  codigoProfessor: Int,
                                  especialidade: String){
        var professorTitularAdd: ProfessorTitular = ProfessorTitular(nome,sobrenome, tempoCasa = 0, codigoProfessor, especialidade)
        listaDeProfessores.add (professorTitularAdd)
        println("Professor $sobrenome cadastrado como titular")
    }

    fun registrarProfessorAdjunto(nome: String,
                                  sobrenome: String,
                                  codigoProfessor: Int,
                                  monitoria: Int){
        var professorAdjuntoAdd: ProfessorAdjunto = ProfessorAdjunto(nome,sobrenome, tempoCasa = 0, codigoProfessor, monitoria)
        listaDeProfessores.add (professorAdjuntoAdd)
        println("Professor $sobrenome cadastrado como adjunto")
    }

    fun excluirProfessor(codigoProfessor: Int){
        var professorRemove: Professor? = null
        for (professor in listaDeProfessores){
            if (professor.codigoProfessor == codigoProfessor){
                professorRemove = professor
                println("Removido o professor ${professorRemove.sobrenome}")
            }
        }
        listaDeProfessores.remove(professorRemove)
    }

    fun matricularAluno(nome: String,
                        sobrenome: String,
                        codigoAluno: Int){
        var alunoAdd = Aluno (nome, sobrenome, codigoAluno)
        listaDeAlunos.add(alunoAdd)
        println("Aluno ${alunoAdd.nome} ${alunoAdd.sobrenome} matriculado na escola pelo RA ${alunoAdd.codigoAluno}")
    }

    fun matricularCurso (codigoAluno: Int,
                         codigoCurso: Int) {
        var matriculaAluno: Aluno? = null
        var matriculaCurso: Curso? = null
        var quantidade = 1

        for (aluno in listaDeAlunos) {
            if (aluno.codigoAluno == codigoAluno) {
                matriculaAluno = aluno
                println("Aluno ${aluno.nome} ${aluno.sobrenome} localizado")
            }
        }

        for (curso in listaDeCursos) {
            if (curso.codigoCurso == codigoCurso) {
                matriculaCurso = curso
                println("Curso ${curso.nome} localizado")
            }
        }

        for (qtd in listaDeMatriculas){
            if(qtd.curso.codigoCurso == codigoCurso) {
                quantidade++
            }
        }

        if (quantidade <= matriculaCurso!!.qtdMaximaAlunos){
            var matriculaAdd = Matricula(matriculaAluno!!, matriculaCurso!!, LocalDate.now())
            listaDeMatriculas.add(matriculaAdd)
            println("Matricula realizada: ${matriculaAluno.nome} - ${matriculaCurso.nome}")
        } else {
            println("Matricula não realizada do aluno ${matriculaAluno!!.nome} em ${matriculaCurso.nome}: ${quantidade-1} alunos matriculados, limite de ${matriculaCurso.qtdMaximaAlunos} alunos")
        }
    }

    fun alocarProfessores(codigoCurso: Int,
                          codigoProfessorTitular:  Int,
                          codigoProfessorAdjunto: Int) {
        var adj:ProfessorAdjunto? = null
        var tit:ProfessorTitular? = null
        var cursoProfessor:Curso? = null


        for (professor in listaDeProfessores){
            if (professor.codigoProfessor == codigoProfessorAdjunto){
                adj = professor as ProfessorAdjunto
            }
        }

        for (professor in listaDeProfessores){
            if (professor.codigoProfessor == codigoProfessorTitular){
                tit = professor as ProfessorTitular
            }
        }

        for (codigo in listaDeCursos){
            if (codigo.codigoCurso == codigoCurso) {
                cursoProfessor = codigo
            }
        }
        cursoProfessor!!.profTitular = tit
        println("Professor ${tit!!.sobrenome} alocado ao curso ${cursoProfessor!!.nome} como professor Adjunto")
        cursoProfessor!!.profAdjunto = adj
        println("Professor ${adj!!.sobrenome} alocado ao curso ${cursoProfessor!!.nome} como professor Titular")
    }
}