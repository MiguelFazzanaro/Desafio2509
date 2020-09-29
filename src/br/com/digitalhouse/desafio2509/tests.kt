package br.com.digitalhouse.desafio2509

fun main() {
    var nome = "curso"
    var codigo = "2000"
    var qt = "2"

    var nome1 = "curso1"
    var codigo1 = "2001"
    var qt1 = "21"

    var nome2 = "curso2"
    var codigo2 = "2002"
    var qt2 = "22"


    var lista:MutableMap<String, List<String>> = mutableMapOf()
    lista.put(codigo, listOf(nome,codigo,qt))
    lista.put(codigo1, listOf(nome1,codigo1,qt1))
    lista.put(codigo2, listOf(nome2,codigo2,qt2))

    println(lista[codigo1]!!.get(2).toInt() == 212)

}