package br.com.digitalhouse.desafio2509

fun main() {

    val professor1 = Professor("Professor", "Girafales", 4, 1)
    val professor2 = Professor("Professor", "Pasquale", 2, 2)
    val professor3 = Professor("Professor", "Pardal", 5, 3)
    val professor4 = Professor("Professor", "Xavier", 7, 4)

    val escola = DigitalHouseManager()

    println("*****************************Cadastro de Cursos*****************************")
    val curso1 = Curso("Full Stack", 20001, 3,null,null)
    val curso2 = Curso("Android", 20002, 2,null,null)

    escola.registrarCurso(curso1.nome,curso1.codigoCurso,curso1.qtdMaximaAlunos)
    escola.registrarCurso(curso2.nome,curso2.codigoCurso,curso2.qtdMaximaAlunos)
    escola.excluirCurso(curso2.codigoCurso)
    escola.registrarCurso(curso2.nome,curso2.codigoCurso,curso2.qtdMaximaAlunos)
    //println(escola.listaDeCursos)
    println("***************************************************************************")
    println("")

    println("*****************************Cadastro de Professores Adjunto e Titular*****************************")
    escola.registrarProfessorAdjunto(professor1.nome, professor1.sobrenome, professor1.codigoProfessor, 8)
    escola.registrarProfessorAdjunto(professor2.nome, professor2.sobrenome, professor2.codigoProfessor, 4)
    escola.registrarProfessorTitular(professor3.nome, professor3.sobrenome, professor3.codigoProfessor, "Android")
    escola.registrarProfessorTitular(professor4.nome, professor4.sobrenome, professor4.codigoProfessor, "Full Stack")
    //println(escola.listaDeProfessores)
    escola.excluirProfessor(1)
    //println(escola.listaDeProfessores)
    escola.registrarProfessorAdjunto(professor1.nome, professor1.sobrenome, professor1.codigoProfessor, 8)
    println("***************************************************************************")
    println("")

    println("*****************************Matricula de Aluno na Escola*****************************")
    escola.matricularAluno("José", "Silva", 1)
    escola.matricularAluno("João", "Santos", 2)
    escola.matricularAluno("Marcos", "Silva", 3)
    escola.matricularAluno("Lucas", "Santos", 4)
    //println(escola.listaDeAlunos)
    println("***************************************************************************")
    println("")

    println("*****************************Matricula do Aluno no Curso*****************************")
    escola.matricularCurso(1,20001)
    escola.matricularCurso(2,20001)
    escola.matricularCurso(3,20001)
    escola.matricularCurso(4,20001)
    escola.matricularCurso(2,20002)
    escola.matricularCurso(3,20002)
    escola.matricularCurso(4,20002)
    //println(escola.listaDeMatriculas)
    println("***************************************************************************")
    println("")

    println("*****************************Professores do Curso*****************************")
    //println(escola.listaDeCursos)
    escola.alocarProfessores(20001,3,1)
    escola.alocarProfessores(20002,4,2)
    //println(escola.listaDeCursos)
    println("***************************************************************************")

    println(escola.listaDeProfessores)


}