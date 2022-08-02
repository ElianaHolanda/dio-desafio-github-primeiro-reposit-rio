package onedigitatalinovation.collections

fun main () {
    val salarios = arrayOf(
    "2000".toBigDecimal(),
    "1500".toBigDecimal(),
    "4000".toBigDecimal()
    )

    println("---------Somando--------")
    println(salarios.somatorio())

    println("---------Media--------")
    println(salarios.media())
}