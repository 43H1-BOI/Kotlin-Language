package Conditional_Statements

fun main() {
    val marks = 98

    print("Your Marks = $marks & Grade = ")
    if (marks in 90..100) {
        println("A+ Grade")
    } else if (marks in 80..90) {
        println("A Grade")
    } else if (marks in 70..80) {
        println("B+ Grade")
    } else if (marks in 60..70) {
        println("B Grade")
    } else if (marks in 45..60) {
        println("C Grade")
    } else if (marks in 35..45) {
        println("P Grade")
    } else {
        println("F Grade")
    }
}