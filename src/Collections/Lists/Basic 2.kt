package Collections.Lists

fun main(){
/*
    Two Types of List :-
        - Immutable
            Cannot be Altered Once Defined
            var list = listOf(1,3,5)
                    OR
            var list = listOf<Int>(1,3,5)

        - Mutable
            Can Add or Remove Elements from List
            var list = mutableListOf(1,3,5)
                    OR
            var list = mutableListOf<Int>(1,3,5)
*/

    val immutableList = listOf<Int>(1,2,3)
    // immutableList[0] = 0
    println("Immutable List :- $immutableList")

    val mutableList = mutableListOf<Int>(1,2,3)
    mutableList[0] = 0
    mutableList.add(5) // to add element at last
    mutableList.add(1,1) // to add element at specific address

    println("Mutable List :- $mutableList")


}