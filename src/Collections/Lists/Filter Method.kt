package Collections.Lists

fun main(){
    val list = listOf("Madam","Sir","Naman","Jalaj","Abhi","Baadme")

    // filter() method is used to filter out some elements out of list as per the conditions
    // it checks if the condition is true then it passes the element else it let the element go

//    With Reference Function
//    val palindromeList = list.filter(::isPalindrome)

//          OR
//    With Anonymous Function
//    val palindromeList = list.filter(fun(str : String) : Boolean{
//        return str.equals(str.reversed(),true)
//    })

//          OR
//    With Lambda Function
    val palindromeList = list.filter{it.equals(it.reversed(),true)}
}

fun isPalindrome(str : String) : Boolean{
    return str.equals(str.reversed(),true)
}