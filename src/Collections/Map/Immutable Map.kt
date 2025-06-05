package Collections.Map

fun main(){
    // Map Consist of a key-value pair where
    // key - value can be of any type
    // Map can contains duplicate values but not duplicate keys

    // Explicit
    val studentDetails = mapOf<Int,String>(9 to "Abhishek" , 2 to "Tushar" , 3 to "Dhairya" , 4 to "Paranjay" , 5 to "Abhishek")
    // Implicit
//  val studentDetails = mapOf(1 to "Abhishek" , 2 to "Tushar" , 3 to "Dhairya" , 4 to "Paranjay" , 5 to "Abhishek")

    println(studentDetails)

    // For Directly Printing through Iteration
    for (i in studentDetails){
        println(i)
    }

    // For Printing with Key through Iteration
    for ((key , value) in studentDetails){
        println("$key  -  $value")
    }
}