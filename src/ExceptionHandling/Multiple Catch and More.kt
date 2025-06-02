package ExceptionHandling


fun main() {

    println("Program for Calculator :: ")

    try {
        print("Enter 1st Number : ")
        val num1 = readln().toDouble()

        print("Enter 2nd Number : ")
        val num2: Double = readln().toDouble()

        print("Enter Operator ( + , - , / , * ) : ")
        val operator: String = readln()

        println("$num1 $operator $num2 = ${calculator(num1, num2, operator[0])}")
    } catch (e: NumberFormatException) {
        // We can also use multiple catch block but the program must not contain more than one try and finally block
        // Always Remember to use Known Exception in starting catch block and only use Exception class at last
        // Because it can handle any type of Exception
        println("Wrong Input Type")
        e.printStackTrace()
    } catch (e: Exception) {
        e.printStackTrace()
        println(e.message)
    } finally {
        println("Program Execution Completed ! ")
    }
}

fun calculator(a: Double, b: Double, operator: Char): Double {
    return when (operator) {
        '+' -> (a + b)
        '-' -> (a - b)
        '*' -> (a * b)
        /*
            For division, calls divide() function which may throw an exception.
            Exception is not handled here, but will be caught in main().
            in this way we can handle exception by using fun in fun exceptions
        */

        '/' -> divide(a, b)
        // here calculator() throws custom exception
        else -> throw UnknownOperator(operator)
    }
}

fun divide(a: Double, b: Double): Double {
    if (b == 0.0) {
        // this line will throw DivideByZeroException which we will handle in the function
        // where this function is used i.e. main
        throw DividingByZeroException()
    }
    return a / b
}

class UnknownOperator(operator: Char) : Exception("\n$operator is not Valid , Please use + , - , / or *\n")

class DividingByZeroException : Exception("\nDon't Divide with Zero Please !!\n")