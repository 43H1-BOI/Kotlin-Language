package OOPS.Object

fun main(){
    MyMath.printPI()

    print("\nEnter Radius of Circle : ")
    var radius = readln().toDouble()
    var area = MyMath.getPI() * radius * radius
    println("\nArea of Circle having radius($radius) = $area")
}


// Can't have Constructors
// Can be Accessed Directly ( Just Like static in Java )
// No Need to Initialize with variable
// IF initialized Then
//      Only One variable can initialize throughout the program




object MyMath{
    const val PI : Double = 3.14159

    fun getPI(): Double = PI

    fun printPI() = print("Value of $PI")
}