package OOPS.Data_Class

fun main(){
    val student1 = Student("Abhishek Yadav", 20, "IC2K23-06")

    // We Can Store values from data class using this method also
    val(stuName,stuAge,stuRollNo) = student1

    println("Student 1 Details :-")
    println("Name = $stuName")
    println("Age = $stuAge")
    println("Roll Number = $stuRollNo")


    var teacher1 = Teacher("Mukesh Yadav Ji", 43, "DX2000-96")

    // Below line will not work
//    val(tName,tAge,tEmpID) = teacher1

}