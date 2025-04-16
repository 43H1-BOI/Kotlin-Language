package ClassAndObj.Basics

// 1st Code
class dog(val name: String){
    init {
        println("$name Woof Woof")
    }
    // data members
    // member functions
}

// 2nd Code
class cat(name: String){
    init {
        println("$name Meow Meow")
    }
    // data members
    // member functions
}

fun main(){
    // In Dog, name is a property so we can call the below : ${r.name}
    val r = dog("Robot")
    println("val name: String -> ${r.name}")

    println()

    // In Cat, name is not property so we can't call the below : ${s.name}
    val s = cat("Stacy")
//    println("val name: String -> ${s.name}")
}