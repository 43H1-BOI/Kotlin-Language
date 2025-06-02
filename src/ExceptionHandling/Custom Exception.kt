package ExceptionHandling

fun main(){
    println("Dividing 5 with 0")

    try {
        divide(5, 0)
    } catch (e: DivideByZeroException) {
        // To Print Exception Message
        println(e.message)

        // To Print Stack Trace
        // means all the details where the exception occurred
        // e.printStackTrace()
    } finally {
        println("Thanks")
    }
}

fun divide(a: Int, b: Int): Int {
    if (b == 0) {
        // this line will throw DivideByZeroException which we will handle in the function
        // where this function is used i.e. main
        throw DivideByZeroException()
    }
    return a / b
}

// My Custom Exception
// This Custom Exception Class will  extend Exception Class and will provide exception message as
// argument to Default Constructor of Exception Class

class DivideByZeroException : Exception("Don't Divide with Zero Please !!")