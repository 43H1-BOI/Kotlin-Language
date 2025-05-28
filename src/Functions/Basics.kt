package Functions

fun main() {
    greeting()
    printTable(5)
    println("Largest Number Between 4 & 2 is ${max(num2 = 4, num1 = 2)}")
}

// function declaration and definition
// no return type and no parameter
// fun fun_name(){
//      Function Definition
// }
fun greeting() {
    println("Hello World\n")
}

// having parameter but no return type
// fun fun_name(parameters...){
//      Function Definition
// }
fun printTable(number: Int) {
    for (i in 1..10)
        println("$number x $i = ${number * i}")

    println()
}

// having return type and parameters
// fun fun_name(parameters... if any) : return_type {
//      Function Definition
// }
fun max(num1: Int, num2: Int): Int {
    return (if (num1 > num2) {
        num1
    } else num2)
}