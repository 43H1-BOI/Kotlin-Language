package Functions

// Lambda Function Means Anonymous Function
// Function having no Name

fun main() {
    // By Providing the function Directly
    // { As Inline Functions , so that compiler will auto recognize return type}
    val addLambda = { x: Int, y: Int -> x + y }

    // By Providing parameters and return type in advance
    val subLambda: (Int, Int) -> Int = { x, y -> x - y }

    // If Not Providing Return Type it will automatically be of Unit type
    // { void in other language }
    val greetLambda = {
        println("Hello ! ")
        println("Jai Shree Ram !! ")
    }

    // If Providing only one parameter then can be referred as it
    val squareLambda: (Int) -> Int = { it * it }
//              OR
//    val squareLambda: (Int) -> Int = { it -> it * it }

    println("Square of 5 = ${squareLambda(5)}")


    // If there is many lines of program then the last line is considered as returning type
    val HBDLambda = {
        println("Happy")
        println("Birthday")
        println("To You")
//         if the below line is not commented then return type is Int
//      3+5
//         if the below line is not commented then return type is Unit
//      println("To You")
    }



}