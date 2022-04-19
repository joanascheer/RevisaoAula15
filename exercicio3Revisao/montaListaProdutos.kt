package exercicio3Revisao

fun montaListaDeProdutos() : DoubleArray {

    println("Quantos produtos o cliente comprou?")
    val quantidadeProdutos = readln().toInt()

    val listaDeProdutos = DoubleArray(quantidadeProdutos)

    return listaDeProdutos

}