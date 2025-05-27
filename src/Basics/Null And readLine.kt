package Basics

fun main(){
    print("Enter Your Name : ")
    val name = readLine()
    // readLine() can also read null Strings or String?

    println("Your Name : ${name?.uppercase()}")
    // So that to handle null we used ? after name so that if name is null then will not
    // execute functions further in the same line that is not usable for null


    print("Enter Your Age : ")
    val age = readLine()

    if(age != null)
        println("Your age is ${age.toInt()}")
    // already checked for null so no need to use ?


    print("Enter Your Birth Year : ")
    val year = readLine()?.toInt()

    println("And Your Birth Year is $year")
}