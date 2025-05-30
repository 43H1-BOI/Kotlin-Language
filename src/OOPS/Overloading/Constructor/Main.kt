package OOPS.Overloading.Constructor

fun main() {
    var rect : Rectangle = Rectangle(5.0)
    rect.showDetails()
}


class Rectangle(
    val length: Double,
    val width: Double
) : Shape("Rectangle") {

    // Constructor Overloading
    // Means One Constructor with Different Functions
    // This will become Square ( Each Side Equal )
    constructor(length: Double) : this(length, length) {
        super.name = "Square"
    }

    constructor(length: Int, width: Int) : this(length.toDouble(), width.toDouble())

    constructor(length: Double, width: Double, name: String) : this(length, width) {
        super.name = name
    }


    init {
        println("Rectangle Created with length = ${this.length} and width = ${this.width}")
    }

    override fun showDetails(){
        println("Details for $name : ")
        println("Perimeter = ${perimeter()}")
        println("Area = ${area()}")
    }

    override fun area() = this.length * this.width

    override fun perimeter() = 2 * (this.length + this.width)
}


abstract class Shape(var name: String = "") {
    open fun showDetails() {
        println("Details for $name : ")
    }

    // Abstract Function
    abstract fun area(): Double
    abstract fun perimeter(): Double
}