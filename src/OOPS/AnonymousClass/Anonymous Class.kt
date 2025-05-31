package OOPS.AnonymousClass

fun main() {

    // By Using Anonymous Objects we can instantiate Abstract Class Objects
    // But have to give Definition to all abstract members
    val thar = object : Vehicle("Thar", 4) {
        override fun vName() {
            println("Vehicle Name is $name")
        }

        override fun vTyres() {
            println("Number of Tyres in $name is $tyres")
        }
    }

    thar.showDetails()

}

abstract class Vehicle(var name: String, val tyres: Int) {

    init {
        println("New Vehicle Registered :: $name")
    }

    open fun showDetails() {
        println("Registered Vehicle Details : ")
        println("Name : $name")
        println("Number of Tyres : $tyres")
    }

    abstract fun vName()
    abstract fun vTyres()
}