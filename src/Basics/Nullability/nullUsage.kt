package Basics.Nullability

fun main() {
    //  var favoriteActor = "Abhishek"
    // what if i don't want to add name of my favorite Actor now

    var favoriteActor = "Salman Khan"
    println(favoriteActor)

    var favActor = null
    println(favActor)

    // cannot reassign a variable with null b'coz String can not hold null values
    //  var name : String = "Abhi"
    //  name = null

    var name: String? = "Abhi"
    println(name)
    // By using ? after String it can be assigned null
    // this also works with other data types

    name = null
    println(name)


    var age: Int? = 18
    age = null
}