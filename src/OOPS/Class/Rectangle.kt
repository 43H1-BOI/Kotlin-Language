package OOPS.Class

/*
    CLASS is a Blueprint
    It is Used to Create OBJECTS

    Basic Topology :-
        All Variable are known as Data Members
        All Functions/Methods are known as Member Functions
        Everything Combined is Known as Members of Class

    Class is Defined by using class keyword

    Syntax :-
    ```
        class class_name{
            // members
        }

        //OR

        class class_name(Data Members){
            init{
                // constructor
            }
            // members
        }
    ```
*/

fun main() {
    val squ = Square()
    print("Enter Side of Square : ")
    squ.side = readln().toDouble()
    println("Area = ${squ.area()}")
    squ.perimeter()

    val rect: Rectangle = Rectangle(5.0, 4.0)
    println("Area = ${rect.area()} &")
    println("Perimeter = ${rect.perimeter()}\n")

    val circ = Circle(5.0)



    val sh = Shape(1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0)
    sh.details()
}

class Square {
    // Data member
    var side: Double = 0.0

    // Member Functions
    fun area() = side * side

    fun perimeter() {
        println("Perimeter = ${4 * this.side}\n")
    }
}

class Rectangle(
    val length: Double,
    val width: Double
) {

    // Constructor
    // This gets called when the object is created for the first time
    init {
        println("Rectangle Created with length = ${this.length} and width = ${this.width}")
    }

    fun area() = this.length * this.width

    fun perimeter() = 2 * (this.length + this.width)
}

class Shape(vararg sides: Double) {
    var name: String = ""
    var size = 0

    init {
        size = sides.size
        name = when (size) {
            1 -> "Straight Line"
            3 -> "Triangle"
            4 -> "Quadrilateral"
            5 -> "Pentagon"
            6 -> "Hexagon"
            7 -> "Heptagon"
            8 -> "Octagon"
            9 -> "Nonagon"
            10 -> "Decagon"
            else -> "Unknown Shape"
        }
        println("A new shape created: $name with ${size} sides.")
    }

    fun details() {
        println("This is a $name and it has ${size} sides.")
    }
}