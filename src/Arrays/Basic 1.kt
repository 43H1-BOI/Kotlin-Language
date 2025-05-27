package Arrays

fun main() {
    // Array is Sequence of any Data Type
    // It Can be of Single Data Type or Combination of Many
    val marks = arrayOf(89, 99, 39, 79, 88) // implicit type declaration
    val size = marks.size

    val greeting = arrayOf<String>("Hello", "Bhailog", ",", "Kese", "Ho", "?") // explicit type declaration
    // means this array is of only Int Data Types

    // Transverse Each Element of an Array
    // Using Size
    println("\n\nElements in Array(Marks) are : ")
    for (i in 0..size - 1)
        print("${marks[i]} ")

    // Using For Each Loop
    println("\n\nElements in Array(Greeting) are : ")
    for (i in greeting)
        print("$i ")


    // We Can Also Use different Data types in Single Array
    val sentence = arrayOf("Tum", "Sirf", 5, "Log", "hi", "Aae", '!')
    // This is Not Recommended

    // Transversal of Above
    println("\n\nElements in Array(Sentence) are : ")
    for (i in sentence)
        print("$i ")
}