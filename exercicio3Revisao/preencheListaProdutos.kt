package exercicio3Revisao

fun preencheListaDeProdutos(listaDeProdutos: DoubleArray) : DoubleArray {

    for (i in listaDeProdutos.indices) {
        println("Qual o valor do produto ${i + 1}?")
        listaDeProdutos[i] = readln().toDouble()
    }

    return listaDeProdutos
}