package ClassAndObj.Basics

fun main() {
    var smartTV = SmartDevice();
    smartTV.turnOn("Samsung Smart TV")
    smartTV.turnOff("Samsung Smart TV")
}

class SmartDevice {
    var dName: String? = null
    var status: Boolean? = null

    fun turnOn(dName: String?) {
        println("$dName is now On")
    }

    fun turnOff(dName: String?) {
        println("$dName is now Off")
    }

    fun dStatus(): String? {
        return (if (status == true) "Online"
        else "Offline")
    }
}