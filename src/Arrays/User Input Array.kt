package Arrays

fun main(){
    // To Get Size & Elements of Array as Input from User
    print("Enter size of Array : ")
    val size : Int = readln().toInt()

    // Array Created and Initialized Each Element with Value 0
    var marks = Array(size){0}

    // Getting values for marks array
    for(i in 0 .. size-1){
        marks[i]= readln().toInt()
    }

    println("\n\nElements in Array(Marks) are : ")
    for (i in marks)
        print("$i ")
}