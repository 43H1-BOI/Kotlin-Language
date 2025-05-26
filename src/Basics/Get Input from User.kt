package Basics

fun main(){
    print("Enter Your Name : ")
    var name = readln()

    print("Enter Your Marks : ")
    val marks = readln().toInt()
    println("$name has $marks marks")
}

/*
    readln() is used to give string as input
    .toInt() is used to convert it to Integer

    same as we use given functions for different types
        .toByte()
        .toBoolean()
        .toFloat()
        .toDouble()

        .toString() is useless as it already reads String


    readLine() can also get nullable String as input
    which we'll discuss later
*/