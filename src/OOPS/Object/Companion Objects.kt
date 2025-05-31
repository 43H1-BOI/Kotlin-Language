package OOPS.Object

import kotlin.math.PI

// Functions and Variable inside companion objects can only be accessed by Class Name
// Or the Object name it gets


fun main(){
    Circle.Greeting.greet()

    // Here area() is called using Circle Class
    println("Formula for Area of Circle = ${Circle.area()}\n")


    val c : Circle = Circle(5.0)
    // Here area() is called using object of Circle Class
    println("Area of Circle having Radius(${c.radius}) = ${c.area()}\n")


}

class Circle(val radius : Double){
    var diameter : Double = radius * 2
    init{
        println("Radius of Circle = $radius")
        println("Diameter of Circle = $diameter")
    }

    // Companion Object is used to create singleton object for Class
    // Whereas Object can be created separately ( with or without class )
    companion object{
        fun area(): String{
            return "PI * Radius^2"
        }
    }

    object Greeting{
        fun greet(){
            println("Hello Sir !\n")
        }
    }

    fun area(): String{
        return "${PI*radius*radius}"
    }
}