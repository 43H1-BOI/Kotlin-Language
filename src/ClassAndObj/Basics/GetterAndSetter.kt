package ClassAndObj.Basics

fun main() {
    val p1 = Phone("Oppo")
    p1.actualAge = 2
    p1.age = 2
    p1.showDetails()

    val p2 = Phone("Mi")
    p2.actualAge = 1
    p2.age = 1
    p2.showDetails()

    val p3 = Phone("Samsung")
    p3.actualAge = 15
    p3.age = 15
    p3.showDetails()


}

class Phone(var company: String) {
    var age: Int = 0
        get() = field
        set(value) {
            field =
                if (value < 1) {
                    0 // sets 0 if age < 1
                } else if (value >= 2 && value <= 5) {
                    value - 1 // sets age - 1 if age = {2,5}
                } else {
                    value // set age if neither conditions are true
                }
        }

    var actualAge: Int = 0

    // Member Functions
    fun showDetails() {
        println("Phone Details : \nCompany : $company \nAge of Device : $age\n\n")
    }
}