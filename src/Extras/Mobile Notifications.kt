package Extras

fun main() {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}


fun printNotificationSummary(numberOfMessages: Int) {
    println(
        if (numberOfMessages <= 99) {
            "You have $numberOfMessages notifications."
        } else {
            "Your phone is blowing up! You have 99+ notifications."
        }
    )
}