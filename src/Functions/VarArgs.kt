package Functions

fun main() {
    val array = intArrayOf(55 , 21 , 69 , 37 , 20 , 0 , 2)
    val maxElement = getMax(1 , 21 , 31, 0 , 9, 11 , *array)
    println("Max Element from (1 , 21 , 31, 0 , 98, 11 , $array) is $maxElement")
}

fun getMax(vararg list: Int): Int {
    val size = list.size
    if (size == 0) return 0

    var max = list[0]
    for (i in 1 until size) {
        if (list[i] > max) {
            max = list[i]
        }
    }

    return max
}

// TODO
//    println("Max Element from ${list} is ${getMax(list)}")
//    Handle List<Int> with Functions
//    val list = listOf<Int>(55 , 21 , 69 , 37 , 20 , 0 , 2)