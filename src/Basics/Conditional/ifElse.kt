package Basics.Conditional

fun main() {
    print("Enter Your Age :: ")
    val age = readln().toInt()

    if (age >= 18) {
        println("You are Eligible to Vote")
    } else {
        println("You are not Eligible to Vote")
    }
}