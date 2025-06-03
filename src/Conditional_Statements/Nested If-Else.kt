package Conditional_Statements

fun main() {
    print("Enter Your Age : ")
    val age: Int = readln().toInt()

    if (age >= 18) {
        println("Welcome To Gaming Hub !")
        println("Product List :")
        println("1. PS2\n2. PS3\n3. PS4\n4. PS5\n5. ASUS Strix")
        val choice: Int = readln().toInt()

        if (choice !in 1..5) {
            println("Invalid Product Choice")
        } else {
            when(choice){
                1 -> println("Playing Games on PS2")
                2 -> println("Playing Games on PS3")
                3 -> println("Playing Games on PS4")
                4 -> println("Playing Games on PS5")
                5 -> println("Playing Games on ASUS Strix")
                else -> println()
            }
        }
    }
}