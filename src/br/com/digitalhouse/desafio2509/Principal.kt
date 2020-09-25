package br.com.digitalhouse.desafio2509

fun main() {
    val aluno1 = Aluno("José", "Silva", 1)
    val aluno2 = Aluno("João", "Santos", 2)
    val aluno3 = Aluno("João", "Silva", 3)
    val aluno4 = Aluno("José", "Santos", 4)

    println(aluno2.equals(aluno4))

    val professor1 = ProfessorAdjunto("Professor", "Girafales", 4, 1, 5)
    val professor2 = ProfessorAdjunto("Professor", "Pachoale", 2, 2, 5)
    val professor3 = ProfessorTitular("Professor", "Chucruti", 5, 3, "Full Stack")
    val professor4 = ProfessorTitular("Professor", "Xavier", 7, 4, "Android")

    println(professor1.equals(professor4))
    


}