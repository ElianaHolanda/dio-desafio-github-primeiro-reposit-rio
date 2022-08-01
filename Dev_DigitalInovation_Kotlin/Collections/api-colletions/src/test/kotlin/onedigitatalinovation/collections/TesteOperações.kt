package onedigitatalinovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 3000.0, 4000.0)
    for (salario in salarios) {
        println(salario)
    }

    println("----------")
    println("Menor salário: ${salarios.first()}")
    println("Maior salário: ${salarios.last()}")
    println("Média salarial: ${salarios.average()}")

    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }
    println("----------")
    salariosMaiorQue2500.forEach { println(it) }
}