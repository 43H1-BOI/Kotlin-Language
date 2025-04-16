package Basics.Nullability

fun main() {
    var favoriteActor: String? = "Abhishek"

    val lengthOfName = favoriteActor?.length ?: 0
    // if value is null then will return default value written after ?:
    /*
    The ?: Elvis operator is an operator that you can use together with the ?. safe-call operator.
    With the ?: Elvis operator, you can add a default value when the ?. safe-call operator returns null.
    It's similar to an if/else expression, but in a more idiomatic way.
    */

    println("The number of characters in your favorite actor's name is $lengthOfName.")
}