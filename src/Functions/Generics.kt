package Functions


// Generics is used to make code more reusable with all kind of data types
// we can create Generic Functions
// As well as Generic class


fun main() {
    // Implicit Definition
    printValue(5)
    // Explicit Definition
    printValue<String>("Hello\n")

    // Implicit Definition
    val d1 = Data(25)
    // Explicit Definition
    val d2: Data<String> = Data("Name")

    d1.printVal()
    d2.printVal()
}

// Generic Function
fun <T> printValue(value: T) {
    println("Value = $value")
}


// Generic Class
class Data<T>(val data: T) {
    fun printVal() {
        println("Data = $data")
    }
}