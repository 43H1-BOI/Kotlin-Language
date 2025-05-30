package OOPS.AbstractClass

import kotlin.math.PI

fun main() {
    // var shape : Shape = Shape()
    var rect : Rectangle = Rectangle(5.0, 4.0)
    println("Area = ${rect.area()}")
}

// Abstract Class is Used as a Structure
// Object of Abstract class cannot be created
// Function/Methods inside Abstract Class can be abstract or not
// Non-Abstract methods can be overridden

abstract class Shape(var name: String = "") {
    val area: Double = 0.0
    abstract val perimeter: Double

    // Normal Function
    // Can be Overridden if Needed
    fun displayName() {
        println(
            if (name == "") "Shape has no name."
            else "This is a $name"
        )
    }

    // Abstract Function
    // Must be Overridden (if not then the subclass will also become abstract class)
    abstract fun area(): Double
    abstract fun perimeter(): Double
}

class Rectangle(var height: Double, var width: Double) : Shape("Rectangle") {
    override val perimeter: Double = 0.0

    override fun area(): Double = height * width
    override fun perimeter(): Double = 2 * (height + width)
}

class Circle(var radius: Double) : Shape("Circle") {
    override val perimeter: Double = 0.0

    override fun area(): Double = radius * radius * PI
    override fun perimeter(): Double = radius * 2 * PI
}