package OOPS.Object

fun main(){
    Important.printPI()
}


// Can't have Constructors
// Can be Accessed Directly ( Just Like static in Java )
// No Need to Initialize with variable
// IF initialized Then
//      Only One variable can initialize throughout the program


object Important{
    const val PI : Double = 3.14159

    fun getPI(): Double = PI

    fun printPI() = print("Value of $PI")
}