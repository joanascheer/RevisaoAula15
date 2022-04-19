package exercicio3Revisao

fun calculaPrecoFinal(listaDeProdutos: DoubleArray) : Double {
    var soma = 0.0

    for (i in listaDeProdutos.indices) {
        soma += listaDeProdutos[i]
    }

    return soma
}