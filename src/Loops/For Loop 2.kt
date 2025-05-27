package Loops

fun main(){
    // to go in reverse order
    print("Enter a Number : ")
    val number : Int = readln().toInt()

    println("5 numbers from $number are ")
    for(i in number downTo (number - 5)){
        print("$i ")
    }

    // to go in reverse order with some difference(steps)
    println("\n\nNumbers from $number with 3 as difference to 5 are ")
    for(i in number downTo 5 step 3){
        print("$i ")
    }
    // means number to 5 but with 3 as a difference
}