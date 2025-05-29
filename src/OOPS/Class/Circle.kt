package OOPS.Class

import kotlin.math.PI

// We Can Also Define Class in Different File
class Circle(
    val radius: Double
) {

    init {
        println("Circle Created with radius = ${this.radius} &")
        println("Area = ${area()} &")
        println("Perimeter = ${perimeter()}\n")
    }

    fun area() = radius * radius * PI

    fun perimeter() = 2 * radius * PI
}