package Functions

fun main(){
    var addition = ::add

    println(
        "Addition of 1 and 2 is ${addition(1,2)}"
    )
}


fun Add(a : Int , b : Int) = a+b