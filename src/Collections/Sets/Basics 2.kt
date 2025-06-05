package Collections.Sets

fun main() {
    val subjects = mutableSetOf("Maths", "Physics", "Chemistry")
//    val subjects = mutableSetOf<String>("Maths","Physics","Chemistry")

    subjects.add("English")// Append at Last
    subjects.remove("Maths")// Remove Element

    println("Element at Index 0 = ${subjects.elementAt(0)}")

    // return all elements with index
    for (i in subjects.withIndex())
        println(i)

    // gives element of set except n elements
    for(i in subjects.drop(1))
        println(i)


}