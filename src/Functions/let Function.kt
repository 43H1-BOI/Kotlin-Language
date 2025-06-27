package Functions

fun main(){
    var name : String? = "Abhishek"

    name.let {
        name = "Anu"
        println(name)
    }

    println(name)

}