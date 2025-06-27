package Collections.Lists

fun main() {
    val num = listOf(1, 2, 3, 4, 5)
    val doubledNum = num.map { it * 2 }

    println("Numbers : $num")
    println("Doubled Numbers : $doubledNum")
}