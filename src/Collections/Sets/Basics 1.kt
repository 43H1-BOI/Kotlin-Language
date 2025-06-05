package Collections.Sets

fun main(){
    // same elements not allowed in set
    // allowed but cannot be stored
    // immutable sets
    val subjects = setOf("Maths","Chemistry","Physics")
    println(subjects)

    // Methods
    println(subjects.elementAt(0))
    println(subjects.contains("English"))

    for (i in subjects.withIndex())
        println(i)



}