package Functions

// Functions that can take fun() as Arguments
// And can also return fun() are known as Higher Order Functions

fun main() {
//     function referencing using ::(fun reference) operator
    val add = ::addition
//          OR
    val sub: (Int, Int) -> Int = ::subtraction


//    Higher Order Function Calling
//    Normal Calling
    basicOperations(4, 6, add)

//          OR
//    Calling With Refence
    basicOperations(4, 6, ::multiplication)

//          OR
//    Calling with Function Itself ( Anonymous )
    basicOperations(
        4, 6,
        fun(a: Int, b: Int): Int {
            return a / b
        }
    )

//          OR
//     Using Lambda Expression / Function
    basicOperations(4, 6, { a, b -> a - b })
//          OR
//      If Last argument is Lambda Expression then it can be written outside the parenthesis
//  basicOperations(4, 6) { a, b -> a - b }

}

fun basicOperations(a: Int, b: Int, function: (Int, Int) -> Int) {
    val result = function(a, b)
    println("Result = $result")
}

fun addition(a: Int, b: Int) = a + b
fun subtraction(a: Int, b: Int) = a - b
fun multiplication(a: Int, b: Int) = a * b

//fun division(a: Int, b: Int): Int {
//    return a / b
//}