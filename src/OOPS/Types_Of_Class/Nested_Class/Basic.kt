package OOPS.Types_Of_Class.Nested_Class

/*
    Inner Class is used to create a class inside another class
    Using inner class , we can also access private members of outer class

    If we create object of outer class then we can not access inner class members

    To Create Object of Inner class we have to create object of outerclass with innerclass

*/


class Person(val name: String, var age: Int) {
    val offID: Int = 0

    constructor() : this("Unknown", 99)

    // inner keyword is used to create inner class
    inner class Student(var rollNo: String, var schoolName: String) {

        constructor() : this("Unknown", "Unknown")

        fun studentDetails() {
            personDetails()
            println("Roll Number : $rollNo")
            println("School : $schoolName")
        }
    }

    private fun personDetails() {
        println("Details for $name")
        println("Age : $age Years.")
    }

    class Teacher(var empID: String, var schoolName: String) {

        fun teacherDetails() {
            // Can't Access name and age because Teacher is not Inner Class
//            println("Details for $name")
//            println("Age : $age Years.")
//            personDetails()
            println("Emp ID : $empID")
            println("School : $schoolName")
        }
    }
}

fun main() {
    // Object Creation of Inner Class
    val unknownPerson = Person().Student()
    val person1 = Person("Abhi", 20).Student("IC-2k23-06", "P.F.H.S. School")

    person1.studentDetails()
}