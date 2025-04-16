package Basics.Conditional

fun main() {
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

}