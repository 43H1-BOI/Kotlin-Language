package OOPS.Inheritance

class Square : Shape("Square") {
    // Data member
    var side: Double = 1.0

    // Member Functions
    fun area() = side * side

    fun perimeter() {
        println("Perimeter = ${4 * this.side}\n")
    }
}