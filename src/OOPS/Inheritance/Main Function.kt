package OOPS.Inheritance

fun main(){
    val squ = Square()
    print("Enter Side of ${squ.name} : ")
    squ.side = readln().toDouble()
    println("Area = ${squ.area()}\n")

    println("Enter new Name for ${squ.name}")
    squ.changeName(readln())
    if(squ.isValid()){
        println("${squ.name} is a Valid Name\n")
    } else {
        println("${squ.name} is not a Valid Name\n")
    }

    val rect: Rectangle = Rectangle(5.0, 4.0)
    println("Area = ${rect.area()} &")
    println("Perimeter = ${rect.perimeter()}\n")

    val circ = Circle(5.0)
}