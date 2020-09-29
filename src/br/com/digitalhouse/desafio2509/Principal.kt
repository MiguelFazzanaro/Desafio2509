package br.com.digitalhouse.desafio2509



fun main() {
    val aluno1 = Aluno("José", "Silva", 1)
    val aluno2 = Aluno("João", "Santos", 2)
    val aluno3 = Aluno("João", "Silva", 3)
    val aluno4 = Aluno("José", "Santos", 4)

    val professor1 = Professor("Professor", "Girafales", 4, 1)
    val professor2 = Professor("Professor", "Pasquale", 2, 2)
    val professor3 = Professor("Professor", "Pardal", 5, 3)
    val professor4 = Professor("Professor", "Xavier", 7, 4)

    val escola = DigitalHouseManager()


    val curso1 = Curso("Full Stack", 20001, 3)
    val curso2 = Curso("Android", 20002, 2)

    curso1.adicionarAluno(aluno1)
    curso2.adicionarAluno(aluno2)
    curso2.adicionarAluno(aluno3)
    curso2.adicionarAluno(aluno4)
    curso1.excluirAluno(aluno1)
    curso1.adicionarAluno(aluno4)

    escola.registrarCurso(curso1.nome,curso1.codigoCurso,curso1.qtdMaximaAlunos)
    escola.registrarCurso(curso2.nome,curso2.codigoCurso,curso2.qtdMaximaAlunos)
    escola.excluirCurso(curso2.codigoCurso)


    escola.matricularAluno(aluno1.nome,aluno1.sobrenome,aluno1.codigoAluno)
    escola.matricularAluno(aluno2.nome,aluno2.sobrenome,aluno2.codigoAluno)
    escola.matricularAluno(aluno3.nome,aluno3.sobrenome,aluno3.codigoAluno)
    escola.matricularAluno(aluno3.nome,aluno3.sobrenome,aluno3.codigoAluno)
    escola.matricularAluno(aluno4.nome,aluno4.sobrenome,aluno4.codigoAluno)

    escola.registrarProfessorAdjunto(professor1.nome,professor1.sobrenome, professor1.codigoProfessor, 8)
    escola.registrarProfessorAdjunto(professor2.nome,professor2.sobrenome, professor2.codigoProfessor, 4)
    escola.registrarProfessorTitular(professor3.nome, professor3.sobrenome, professor3.codigoProfessor, "Android")
    escola.registrarProfessorTitular(professor4.nome, professor4.sobrenome, professor4.codigoProfessor, "Full Stack")
    println(escola.listaDeProfessores)

    escola.excluirProfessor(1)
    println(escola.listaDeProfessores)

    escola.excluirProfessor(9)
    println(escola.listaDeProfessores)

    escola.matricularCurso(1,20001)
    escola.matricularCurso(2,20001)
    escola.matricularCurso(3,20001)
    escola.matricularCurso(4,20001)
    println(escola.listaDeMatriculas)






//
//    val matriculaAluno1 = Matricula(aluno1, curso1, "11-10-20")
//    val matriculaAluno12 = Matricula(aluno1, curso2, "11-10-20")
//    val matriculaAluno2 = Matricula(aluno2, curso2, "11-10-20")
//    val matriculaAluno3 = Matricula(aluno3, curso1,"11-10-20" )
//    val matriculaAluno4 = Matricula(aluno4, curso2, "11-10-20")
//
//    val escola = DigitalHouseManager(listOf(aluno1,aluno2,aluno3,aluno4),
//            listOf(professor1,professor2,professor3,professor4),
//            listOf(curso1,curso2),
//            listOf(matriculaAluno1,matriculaAluno12,matriculaAluno2,matriculaAluno3,matriculaAluno4))





}