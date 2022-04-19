package exercicio1Revisao

fun somaNumeros() {
    println("Digite o primeiro valor: ")
    val primeiroNumero = readln().toInt()

    println("Digite o segundo número: ")
    val ultimoNumero = readln().toInt()

    var soma = 0
    //soma += i

    for (i in primeiroNumero .. ultimoNumero) {
        if (i % 13 != 0) {
            soma += i
        } else {

        }
    }

    println(soma)
}