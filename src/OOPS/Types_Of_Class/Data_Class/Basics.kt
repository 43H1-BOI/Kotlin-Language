package OOPS.Types_Of_Class.Data_Class

// Data Class are used to Store data members only
// No Function can be created with data class

/* Syntax :-
    data class Class_Name(variables...)

    Rules for Data Class :
        There must be at least one data members available in data class
        All Members must be of var/val types
        No Function must be created inside data class


    Data Class Provides Functionality to Print all Details as String By
        - Directly using object
        - Using toString() Method
*/

// Data Class
data class Student(var name: String, var age: Int, val rollNo: String)

// Normal Class
class Teacher(var name: String, var age: Int, val empID: String)

fun main() {

    var student1 = Student("Abhishek Yadav", 20, "IC2K23-06")
    println("\nPrinting Student's ( Data Class ) Details :- \n$student1")


    println("\nBy Using toString() Method :- \n${student1.toString()}")


    var teacher1 = Teacher("Mukesh Yadav Ji", 43, "DX2000-96")
    println("\nPrinting Teacher's ( Normal Class ) Details :- \n$teacher1")


}