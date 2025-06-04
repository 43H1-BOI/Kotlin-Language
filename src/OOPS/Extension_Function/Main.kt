package OOPS.Extension_Function

// Extension Functions are used to create and define class methods outside class
class Circle(val radius: Int) {
    fun printArea() {
        println("Area of Circle of Radius($radius) = ${radius * radius * 3.1415}\n")
    }
}

fun Circle.printPerimeter() {
    println("Perimeter of Circle of Radius($radius) = ${2 * 3.1415 * radius}\n")
}

// We can do the same with any class (user-defined or pre-defined)
fun String.isPalindrome(): Boolean {
    return this.equals(this.reversed(), true)
}

fun main() {
    var circle1 = Circle(5)
    circle1.printArea()
    circle1.printPerimeter()

    var name: String = "Naman"
    println(
        "$name is " +
                if (name.isPalindrome()) "Palindrome"
                else "Not Palindrome"
    )
}