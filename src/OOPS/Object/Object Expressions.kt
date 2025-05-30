package OOPS.Object

fun main() {
    // If we declare and define object and
    // Initialize it at same time as Anonymous Object
    // Then it is known as Object Expressions

    // A singleton ensures that a class has only one
    // instance and provides a global point of access to it.

    val Emp101 = object {
        val name = "Abhishek Yadav"
        val duty = "Serial Number"
        val location = "Indore"
        private val DOB = "06-March-2005"

        fun details() {
            println("$name, $duty, $location")
        }

        fun getDOB(): String = DOB
    }

    Emp101.details()
    println(Emp101.getDOB())

}