package ClassAndObj.Basics

fun main() {
    var smartAC = SmartDevice()
    smartAC.status = true
    smartAC.dName = "Samsung 1.5T AC"

    smartAC.turnOn(smartAC.dName)

    smartAC.status = false
    println(smartAC.dStatus())
}