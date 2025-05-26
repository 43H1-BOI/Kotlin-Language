package ConditionalStatements

fun main() {
    // switch case is here when
    // when is used to remove multiple if - else
    print("Enter Your Marks : ")
    val marks = readln().toInt()

    print("Your Marks = $marks & Grade = ")

    when (marks) {
        in 90..100 -> println("A+ Grade")
        in 80..90 -> println("A Grade")
        in 70..80 -> println("B+ Grade")
        in 60..70 -> println("B Grade")
        in 45..60 -> println("C Grade")
        in 35..45 -> println("P Grade")
        else -> println("F Grade")
    }
}