package Collections.Lists

fun main() {
    var allStates: MutableList<Boolean> = mutableListOf(true, false, false, false, false)


    println(allStates)

    allStates.forEachIndexed {idx , _ ->
        allStates[idx] = false
    }

    println(allStates)
}