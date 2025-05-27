package Loops

fun main(){
    // Do While is used when at least once the loop must run and then will check condition
    var num = 1

    do{
        println("${5} x ${num} = ${num*5}")
        num++
    }while(num <= 10)

}