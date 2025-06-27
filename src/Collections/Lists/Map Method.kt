package Collections.Lists

fun main() {

    // To make a change in whole list , we use map{} method
    // To Convert One Type to Another
//    val list = listOf("Madam","Sir","Naman","Jalaj","Abhi","Baadme")

//    val upperList = list.map {it -> it.uppercase() }
//    println(upperList)


    val letters = listOf<Char>('A', 'B', 'C')

//    val lettersToNum = list.map {it -> it.toInt()}
    val lettersToNum = letters.map { it -> it.code }
    // to convert it to ASCII

    println(lettersToNum)


    // Provides kind of For Each Loop
    letters.forEach { print("$it ") }


    // Provides Count of Elements of List
    println("\nCount : ${letters.count()}")
}