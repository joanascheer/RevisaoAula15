package exercicio2Revisao

fun exibeLista(listaDeNumeros: IntArray) {
    for (i in listaDeNumeros.indices) {
        println("Posição ${i+1} : ${listaDeNumeros[i]}")
    }
}