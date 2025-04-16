package Basics.Conditional

fun main() {
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