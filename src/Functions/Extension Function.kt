package Functions

fun main() {
    print("Enter a Number : ")
    val number: Int = readln().toInt()
    println(
        if (number.isEven())
            "Number is Even"
        else
            "Number is Odd"
    )

//    if (number.isEven())
//        println("Number is Even")
//    else
//        println("Number is Odd")
}

// This Extension Function is Used  to Create Methods for Predefined Data Types
// these methods can be used as class methods by . operator
// Eg :- int.isEven()
fun Int.isEven(): Boolean {
    return (this % 2 == 0)
}

