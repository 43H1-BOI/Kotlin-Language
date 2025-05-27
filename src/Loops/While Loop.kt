package Loops

fun main() {
    println("Jawaan Karne ki Machine : \n")

    print("Enter Your Age : ")
    var age = readln().toInt()

    if (age > 18) {
        println("You are more than 18 Years Old")
        while (age > 18) {
            age--
            println("\nRemoving 1 Year of Life ")
            println("Now You are $age Years Old")
        }
        println("Enjoy Your Jawani !")
    } else {
        println("Or Kitna Chota hoga be")
    }
}