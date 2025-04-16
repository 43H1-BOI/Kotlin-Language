package Basics.Conditional

fun main() {
    print("Enter Your Age :: ")
    val age = readln().toInt()

    if (age >= 18) {
        println("You are Eligible to Vote")
    } else {
        println("You are not Eligible to Vote")
    }


    print("Enter Your Marks :: ")
    val marks = readln().toInt()

    println(
        if (marks >= 90) {
            "O Grade"
        } else if (marks in 80..90) {
            "A Grade"
        } else if (marks in 60..80) {
            "B Grade"
        } else if (marks in 33..60) {
            "C Grade"
        } else {
            "Fail"
        }
    )


    print("Enter Your Course Code : ")
    val courseCode = readln().toInt()

    println(
        when (courseCode) {
            1 -> "MCA"
            2 -> "MTech"
            3 -> "MBA"
            else -> "Invalid Code"
        }
    )
}