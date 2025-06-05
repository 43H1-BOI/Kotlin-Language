package Collections.Map

fun main(){
    // Explicit
    val studentDetails = mutableMapOf('A' to "Abhishek" , 'T' to "Tushar" , 'D' to "Dhairya" , 'P' to "Paranjay" , 'A' to "Abhishek")
    // Implicit
//    val studentDetails = mutableMapOf<Char,String>('A' to "Abhishek" , 'T' to "Tushar" , 'D' to "Dhairya" , 'P' to "Paranjay" , 'A' to "Abhishek")



    // TO Add any Key-Value Pair
    studentDetails.put('M',"Mukesh")
    studentDetails.put('F',"Fufaji")

    println(studentDetails)

    // To Remove any key-value Pair
    studentDetails.remove('F')

    // For Replacement at key
    studentDetails.replace('M',"Maa")

    // For Printing with Key through Iteration
    for ((key , value) in studentDetails){
        println("$key  -  $value")
    }

    // To Clear Map
    studentDetails.clear()

}