package ClassAndObj.Basics

data class sportsPerson(
    val name: String,
    var age: Int,
    var address: String,
    val id: Long,
    val sport: String
)

fun main() {
    val Pappu = sportsPerson("Rahul Gandhi", 20,"New Delhi", 51205,"Cricket")

    makeID(Pappu)
}

fun makeID(sP : sportsPerson){
    println("Making ID for ${sP.name} : \n")
    println("ID : ${sP.id}")
    println("Name : ${sP.name}")
    println("Age : ${sP.age}")
    println("Sport : ${sP.sport}")
    println("Address : ${sP.address}")
}