package OOPS.Overloading.Function

fun main() {
    println("Add(3 , 5) = ${add(3, 5)}")
    println("Add(3.7 , 5) = ${add(3.7, 5)}")
    println("Add(3.7 , 5.3) = ${add(3.7, 5.3)}")
}

fun add(n1: Int, n2: Int) = n1 + n2

fun add(n1: Double, n2: Int) = n1 + n2

fun add(n1: Double, n2: Double) = n1 + n2

fun add(n1: Int, n2: Int, n3: Int): Int {
    return add(n1, n2) + n3
}

fun add(n1: Double, n2: Double, n3: Double): Double {
    return add(n1, n2) + n3
}

fun add(n1: Double, n2: Int, n3: Double): Double {
    return add(n1, n2) + n3
}