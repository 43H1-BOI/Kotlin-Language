package Functions

// Learn About Classes Before this
// Scope Function :-
//    let
//


fun main() {

    val abhi: Student = Student()
    val anu: Student? = null

    val applyK = abhi.apply {
        // Uses this or none
        this.name = "Abhishek"
        age = 20
        // Class Return Type
    }

    val letK = anu?.let {
        // Uses it
        // Provides Null-Safety
        it.name = "Anurag"
        it.age = 20
        println("Name = ${it.name}")
        // Returns as Lambda Function (Last Line of Block)
    }

    val alsoK = abhi.also {
        // Uses it
        it.name = "Abhishek"
        it.age = 20
        // Class Return Type
    }

    val runK = abhi.run {
        // Uses this or none
        // It also Provides null-safety
        // and also enables us to do computation on objects
        // with + let = run

        // Returns as Lambda Function (Last Line of Block)
    }

    val withK = with(abhi) {
        // To Do Computation on Object
        println("Name = $name")

        // Returns as Lambda Function (Last Line of Block)
    }

}

class Student(var name: String, var age: Int) {
    constructor() : this("", 0)
    constructor(name: String) : this(name = name, 0)
}