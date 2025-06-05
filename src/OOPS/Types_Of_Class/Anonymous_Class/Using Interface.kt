package OOPS.Types_Of_Class.Anonymous_Class

// TODO


/*
1. Implementing an Interface with Anonymous Class:
In this example, an interface Greeter is defined with a single function greet. The power of Kotlin's anonymous class is showcased by implementing this interface on the fly, providing a customized greeting message.

1. Implementing an Interface with Anonymous Class:
kotlin
Copy code
// Define an interface
interface Greeter {
    fun greet(name: String): String
}

fun main() {
    // Using an anonymous class to implement the Greeter interface
    val greeter = object : Greeter {
        override fun greet(name: String): String {
            return "Hello, $name! Welcome to the world of Kotlin anonymous classes."
        }
    }

    // Call the greet function
    val greeting = greeter.greet("John")
    println(greeting)
}
2. Extending a Class with Anonymous Class:
Here, the Animal class is extended using an anonymous class, allowing for the override of the makeSound function. This feature is particularly useful when you need to create one-off instances with unique behavior.

// Base class
open class Animal {
    open fun makeSound() {
        println("Generic animal sound")
    }
}

fun main() {
    // Extending the Animal class with an anonymous class
    val dog = object : Animal() {
        override fun makeSound() {
            println("Woof! Woof! Kotlin's anonymous classes make it easy to customize behavior.")
        }
    }

    // Call the makeSound function
    dog.makeSound()
}
3. Anonymous Class with Function Parameter:
In this example, a higher-order function performOperation is created to take a function parameter. An anonymous class is employed to implement this function on the fly, it shows how flexible anonymous classes can be!

// Define a higher-order function that takes an anonymous class as a parameter
fun performOperation(operation: () -> Unit) {
    operation()
}

fun main() {
    // Use an anonymous class with the performOperation function
    performOperation(object : () -> Unit {
        override fun invoke() {
            println("Performing the operation using Kotlin's anonymous class.")
        }
    })
}
So, whether you’re implementing interfaces dynamically, customizing class behaviors, or utilizing anonymous classes as function parameters, Kotlin provides a seamless and expressive syntax for these scenarios. The examples presented in this tutorial showcase the versatility of anonymous classes in addressing various programming needs.
*/