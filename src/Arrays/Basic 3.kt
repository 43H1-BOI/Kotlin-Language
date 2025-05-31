package Arrays

fun main(){
    // Transverse Array With Index
    val marks = arrayOf(89, 99, 39, 79, 88)

    println("Element --> Index")
    // here e is element and i is index
    // if we swap them then result will also differ
    for((e,i) in marks.withIndex())
        println("$i --> $e")
}