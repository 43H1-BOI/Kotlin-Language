package OOPS.Inheritance

import kotlin.math.PI

// We Can Also Define Class in Different File
class Circle(
    val radius: Double
) : Shape("Circle"){

    init {
        println("${super.name} Created with radius = ${this.radius} &")
        println("Area = ${area()} &")
        println("Perimeter = ${perimeter()}\n")
    }

    fun area() = radius * radius * PI

    fun perimeter() = 2 * radius * PI
}