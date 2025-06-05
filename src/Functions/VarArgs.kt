package Functions

fun main() {
    val array = intArrayOf(55, 21, 69, 37, 20, 0, 2)
    val maxElement = getMax(1, 21, 31, 0, 9, 11, *array)
    println("Max Element from (1 , 21, 31, 0, 9, 11 ${returnArray(array)}) is $maxElement")


//    val list = listOf("S","T","R","I","N","G")
//    printElements(list)
    printElements("S","T","R","I","N","G")
}

fun returnArray(array: IntArray): String {
    var string = ""
    for (i in array) {
        string += ", $i"
    }
    return string
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

fun average(vararg list: Int) : Double{
    var sum =0
    for(i in list) sum+=i
    return sum.toDouble()/list.size
}

// Generic Function
fun <T>printElements(vararg maal:T){
    for((i,e) in maal.withIndex()){
        println("$i - $e")
    }
}

// TODO
//    println("Max Element from ${list} is ${getMax(list)}")
//    Handle List<Int> with Functions
//    val list = listOf<Int>(55 , 21 , 69 , 37 , 20 , 0 , 2)