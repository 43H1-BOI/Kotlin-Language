package Loops

fun main(){
    // for(initialization , condition , operation after each iteration<mostly increment/decrement>)
    // all happen in single statement , no need to use separate statement for all
    println("Printing Table of Any Number :- ")
    print("Enter a Number : ")
    val number : Int = readln().toInt()

    // .. means <= to <=
    for(i in 1..10){
        println("$number x $i = ${number*i}")
    }

    println("\n")
    // until means <= to <
    for(i in 1 until 11){
        println("$number x $i = ${number*i}")
    }
}