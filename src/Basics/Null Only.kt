package Basics

fun main() {
    // null values are defined by using ? after return type
    // Means these can hold values of return type or null values
    // var name : type ? = value

    var name: String? = "Abhishek Yadav"
    var age: Int? = null
    var id = null

    age = 20
//    id = 101

    println("Details : ")
    println("Name - $name")
    println("Age - $age")
    println("Id - $id")


    print("\n\nLength of Name($name) Using ?. = ")
    print(name?.length)
    // this ?. (safe call operator) is used so that the
    // fun will only call when the values are not null
//    print(name.length)
// Can't do this b'coz name can also be null and if yes then how can we define length ???
// We can use the ?. safe call operator to access methods or properties of nullable variables.
// SYNTAX -> nullable variable ?. method


// You can also use the !!. not-null assertion operator to access methods or properties of nullable variables.
// SYNTAX -> nullable variable !!. method
// !!. (Not Null Assertion Operator) ensures that we have not given null value
// and if given null values then will throw NullPointerException

    name = null
    print("\n\nLength of new Name($name) Using !!. = ")
//    print(name!!.length)
    /*
        Unlike ?. safe-call operators, the use of a !! not-null assertion operator may result in a NullPointerException error
        being thrown if the nullable variable is indeed null. Thus, it should be done only when the variable is always
        non-nullable or proper exception handling is set in place. When not handled, exceptions cause runtime errors
    */


    // We can also use . operator for null values if we check for null before calling method
    // By Using if-else

    print("\n\nLength of Name($name) Using . = ")
    if (name != null) {
        print(name.length)
    } else {
        print("NULL\n")
        age = null
    }


    // There is Elvis ?: Operator out there used to define what to do if value is null or not
    age?.printTable() ?: print("Table for null is not Possible")
    // This Elvis Operator is like ternary operator not for boolean but for null instead

    /*
    CONCLUSION ::
        A variable can be set to null to indicate that it holds no value.
        Non-nullable variables cannot be assigned null.
        Nullable variables can be assigned null.
        To access methods or properties of nullable variables, you need to use ?. safe-call operators or !! not-null assertion operators.
        You can use if/else statements with null checks to access nullable variables in non-nullable contexts.
        You can convert a nullable variable to a non-nullable type with if/else expressions.
        You can provide a default value for when a nullable variable is null with the if/else expression or the ?: Elvis operator.
    */
}

fun Int.printTable() {
    for (i in 1..10)
        println("$this * $i = ${this * i}")
}