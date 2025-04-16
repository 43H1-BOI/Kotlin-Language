package ClassAndObj.Basics

fun main() {
    val P1 = Person("Abhi", 17)

    if (P1.isEligibile()) {
        println("${P1.nameIs()} can Vote")
    } else
        println("${P1.nameIs()} can not Vote")
}

class Person(val name: String, var age: Int) {
    fun isEligibile(): Boolean {
        if (age >= 18)
            return true
        return false
    }

    fun nameIs(): String{
        return name
    }
}