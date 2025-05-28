package Functions

fun main() {
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    val sum = add(num1, num2)

    println("$num1 + $num2 = $sum")


    val list = listOf<Int>(55, 21, 69, 37, 20, 0, 2)
    println("\nFirst Element from ${list} is ${firstElement(list)}")
}


// This is Inline Function
// Declared and defined in a single line or two
// fun fun_name(parameters... if any) = operation
// must not contain loop
// will return some value
fun add(num1: Int, num2: Int) = num1 + num2

fun firstElement(list: List<Int>) = list[0]