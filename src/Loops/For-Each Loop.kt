package Loops

fun main(){
    // For-Each loop is used to Iterate over String , Arrays , List or Any Collection of Data
    val marks = arrayOf(88,94,83,76,96)

    for(i in marks){
        print("$i ")
    }
    println()

    val name = "Abhishek"

    for(letter in name)
        print("$letter ")
}