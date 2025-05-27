package Arrays

fun main(){
    // We Can Also Get Specific Elements from array by using array[index] method
    val marks = arrayOf(89, 99, 39, 79, 88)
    // Index :-         0 , 1 , 2 , 3 , 4

    val size = marks.size

    // Kotlin uses 0 Based Indexing
    // Means 1st Element has 0 Index
    //       2nd Element has 1 Index ...
    //       Last Element has Size(Array) - 1 Index

    println("First Element in Array : ${marks[0]}")
    println("3rd Element in Array : ${marks[2]}")
    println("Last Element in Array : ${marks[size-1]}")
}