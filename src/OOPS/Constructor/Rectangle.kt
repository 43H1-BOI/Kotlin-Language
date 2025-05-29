package OOPS.Constructor




class Rectangle(
    val length: Double,
    val width: Double
) {

    // Constructor
    constructor(width : Double) : this(width,width)

    constructor(length : Int , width : Int) : this(length.toDouble(),width.toDouble())

    init {
        println("Rectangle Created with length = ${this.length} and width = ${this.width}")
    }

    fun area() = this.length * this.width

    fun perimeter() = 2 * (this.length + this.width)
}