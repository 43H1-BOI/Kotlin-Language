package OOPS.Enum_Class

fun main(){
    val dirEast = Directions.EAST

    // this prints index of East i.e. 0
    println("Index(Ordinal) of East = ${dirEast.ordinal}\n")

    for(i in Directions.entries){ // OR WeekDays.values()
        println("${i.name} ")     // OR i (only)
    }

    val week = WeekDays.TUESDAY
    week.printDayName()

}