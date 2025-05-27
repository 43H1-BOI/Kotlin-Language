package ConditionalStatements

fun main() {
    // switch case is here when
    // when is used to remove multiple if - else
    print("Enter Your Marks : ")
    val marks = readln().toInt()

    print("Your Marks = $marks & Grade = ")

    when (marks) {
        in 90..100 -> println("O Grade")
        in 80..90 -> println("A+ Grade")
        in 70..80 -> println("A Grade")
        in 60..70 -> println("B+ Grade")
        in 45..60 -> println("B Grade")
        in 35..45 -> println("C Grade")
        33 , 34 -> println("Almost Fail Grade")
        else -> println("F Grade")
    }
}