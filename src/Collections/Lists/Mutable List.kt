package Collections.Lists

fun main(){
/*
- Mutable
    Can Add or Remove Elements from List
        var list = mutableListOf(1,3,5)
                OR
        var list = mutableListOf<Int>(1,3,5)
*/

    // can have no element at all but must contain Data Type
    // val mutableList = mutableListOf<Int>()
    val mutableList = mutableListOf<Int>(5,7,17,72,56)

    mutableList.add(95) // to add element at last
    mutableList.add(0,0) // to add element at any index

    println("\nElement in Immutable List = $mutableList")

    mutableList.remove(17)
    println("\nAfter Removing 17 = $mutableList")

    mutableList.removeAt(0)
    println("\nAfter Removing Element at Index 0 = $mutableList")
}