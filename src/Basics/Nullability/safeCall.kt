package Basics.Nullability

fun main() {
    val fName: String = "Abhi"
    println(fName.length)
    // this will give length of fName

    val lName: String? = "Yadav"
    println(lName?.length)
    // this will give length of lName (nullable variable)
    // known as safe-call operator ?.

    var mName: String? = "Singh"
    println(mName!!.length)
    // this will give length of mName (nullable variable)

    /*
        mName = null
        println(mName!!.length)
        // this will give a NullPointerException
        // known as not-null assertion operator !!.
    */

    /*
    Unlike ?. safe-call operators, the use of a !! not-null assertion operator may result
    in a NullPointerException error being thrown if the nullable variable is indeed null.
    */


}