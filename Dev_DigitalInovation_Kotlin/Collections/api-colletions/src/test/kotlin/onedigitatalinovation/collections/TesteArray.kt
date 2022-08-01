package onedigitatalinovation.collections

fun main() {
    val values = IntArray(size = 5)
    values[0] = 1
    values[1] = 2
    values[2] = 6
    values[3] = 3
    values[4] = 7
    for (valor in values){
        println(valor)
    }

    println("------------")
    values.forEach {
      println(it)
    }

    println("------------")
    for (index in values.indices){
        println(values[index])
    }

    println("------------")
    values.sort()
    for (valor in values) {
        println(valor)
    }
}