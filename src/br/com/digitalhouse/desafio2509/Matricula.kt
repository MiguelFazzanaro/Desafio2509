package br.com.digitalhouse.desafio2509

import java.time.LocalDate

data class Matricula(var aluno: Aluno,
                     var curso: Curso,
                     var dataMatricula: LocalDate)  {

}