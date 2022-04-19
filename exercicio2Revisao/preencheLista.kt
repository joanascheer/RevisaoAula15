package exercicio2Revisao

fun preencheLista () : IntArray {
    val listaDeNumeros = IntArray(10)

    println("Escolha o valor da primeira posição da lista:")
    listaDeNumeros[0] = readln().toInt()

    for (i in 1..9) {
        listaDeNumeros[i] = listaDeNumeros[i-1] * 2
    }

    return listaDeNumeros
}