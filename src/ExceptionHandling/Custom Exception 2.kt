package ExceptionHandling


fun main() {
    try {


        println(calculator(4.0, 5.0, '+'))
        println(calculator(4.0, 5.0, '-'))
        println(calculator(4.4, 5.5, '*'))
        println(calculator(4.2, 5.3, '/'))
//        println(calculator(4.2, 0.0, '/'))
        println(calculator(4.0, 5.0, '='))
        println("All Set !!")
    } catch (e: Exception) {
        println(e.message)
    }
}

fun calculator(a: Double, b: Double, operator: Char): Double {
    return when (operator) {
        '+' -> (a + b)
        '-' -> (a - b)
        '*' -> (a * b)
        '/' -> divide(a, b)
        else -> throw UnknownOperator(operator)
    }
}

fun divide(a: Double, b: Double): Double {
    if (b == 0.0) {
        // this line will throw DivideByZeroException which we will handle in the function
        // where this function is used i.e. main
        throw DivideByZeroException()
    }
    return a / b
}

class UnknownOperator(operator: Char) : Exception("$operator is not Valid , Please use + , - , / or *")

class DividingByZeroException : Exception("Don't Divide with Zero Please !!")