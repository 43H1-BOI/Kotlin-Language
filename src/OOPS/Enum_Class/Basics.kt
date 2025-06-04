package OOPS.Enum_Class

fun main(){
    val dirEast = Directions.EAST
    println("Value in dirEast = $dirEast")

    val monday = WeekDays.MONDAY
    println("\nValue in monday = $monday")
    println("Value in num of monday = ${monday.num}")
}




// If there are fixed sets of values then we use Enum Classes
// These Values are kind of Instance/Object of enum class
// Here we know number of possible objects

enum class Directions{
    EAST,
    WEST,
    NORTH,
    SOUTH
}

// enum class can also have constructors
// As all the values are its object so that they need a parameter to be passed during creation
enum class WeekDays(val num : Int){
    SUNDAY(0),
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6);
    // if you want to add members in class use ; after last enum entry else use } to end class

    fun printDayName(){
        println("\nName of Day = $this")
    }
}