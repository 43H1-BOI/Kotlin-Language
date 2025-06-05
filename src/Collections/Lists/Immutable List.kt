package Collections.Lists

fun main(){
/*
- Immutable
    Cannot be Altered Once Defined
        var list = listOf(1,3,5)
                OR
        var list = listOf<Int>(1,3,5)
*/
    val immutableList = listOf(5,6,7)

    println("Element in Immutable List = ${immutableList}")

    println("Element at Index 0 = ${immutableList.get(0)}")
    println("Index of Element 6 = ${immutableList.indexOf(6)}")
    println("Size = ${immutableList.size}")
}