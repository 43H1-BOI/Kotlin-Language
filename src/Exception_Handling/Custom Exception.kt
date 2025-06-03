package Exception_Handling

// My Custom Exception
// This Custom Exception Class will  extend Exception Class and will provide exception message as
// argument to Default Constructor of Exception Class
class UnderAgeException : Exception("Pehle Bade Ho Jao Beta !!")

fun main() {
    println("18+ Game :: ")
    print("Please Verify Your Age : ")
    val age = readln().toInt()

    try {
        verifyAge(age)
    } catch (e: UnderAgeException) {
        // To Print Exception Message
        println(e.message)

        // To Print Stack Trace
        // means all the details where the exception occurred
        // e.printStackTrace()

        // will end program once exception occurred
        return
    }

    println("\nNo 18+ Game Here.")
    println("Haha ! I am Just Jooking ")

}

fun verifyAge(age : Int){
    if(age < 18){
        throw UnderAgeException()
    }
    println("Congratulation ! You Passed the Age Test .")
}