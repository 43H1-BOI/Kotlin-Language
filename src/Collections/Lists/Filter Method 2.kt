package Collections.Lists

fun main() {
    val num = (1..100).toList()

    // to filter out of all elements
    val divBySeven = num.filter { it.rem(7) == 0 }
}