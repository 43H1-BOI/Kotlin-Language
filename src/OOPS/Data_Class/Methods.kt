package OOPS.Data_Class

// Classes Already Declared in Same Package
// So No Need To Declare them Again

// Data Classes Having Same Data returns True
// While Normal Class returns False

/*
    We Can Compare Two Data Classes Using two methods :-
       - Using .equals() Method
       - Using == Operator
*/

fun main() {

//  Two Different Objects having Same Data in it
    val stu1 = Student("Abhishek Yadav", 20, "IC2K23-06")
    val stu2 = Student("Abhishek Yadav", 20, "IC2K23-06")

    println("\nComparing ( Data Class ) :- \n${stu1.equals(stu2)}")

    // Two Different Objects having Same Data in it
    val tea1 = Teacher("Mukesh Yadav Ji", 43, "DX2000-96")
    val tea2 = Teacher("Mukesh Yadav Ji", 43, "DX2000-96")

    println("\nComparing ( Normal Class ) :- \n${tea1.equals(tea2)}")


    //  To Copy Values of stu1 in stu2
    val stu4 = stu1
    //  val stu2 = stu1.copy()


    // To Copy Data with Some Modification
    val stu3 = stu1.copy(name = "Tushar Kharade")

}