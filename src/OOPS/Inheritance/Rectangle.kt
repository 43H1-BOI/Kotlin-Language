package OOPS.Inheritance

class Rectangle(
    val length: Double,
    val width: Double
) : Shape("Rectangle") {

    // Constructor
    // This gets called when the object is created for the first time
    init {
        println("Rectangle Created with length = ${this.length} and width = ${this.width}")
    }

    fun area() = this.length * this.width

    fun perimeter() = 2 * (this.length + this.width)
}