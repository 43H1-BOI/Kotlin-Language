package ExceptionHandling

fun main() {

    // Exceptions are runtime errors which can interrupt normal flow of program
    // We Can Handle them using try-catch Block

    var num = try {
/*
    Piece of Code which may cause interrupting in program
           OR
    Any Doubtful Code

    # Here if user inputs string or char then will throw exception
*/
        readLine()?.toInt()
    } catch (e: NumberFormatException) {
/*
    Handling Code
    This Piece of code will only work when there is an exception occurred
    otherwise it won't run

    # Here it will set 0 to num if any number is not given
*/
        0
    } finally {
/*
    This Contains Cleanup Code
    This Block will always execute whether exception occurs or not
*/
        println("Thanks for Using this Program")
    }


    /*
    Syntax :-
        try {
            Piece of Code which may cause interrupting in program
                OR
            Any Doubtful Code
        } catch( e : nameOfException OR Exception<Generic Exception CLass>) {
            Handling Code
            This Piece of code will only work when there is an exception occurred
            otherwise it won't run
        } finally { // Optional Block but preferred
            This Contains Cleanup Code

            This Block will always execute whether exception occurs or not

        }
    */

    println("Value of num = $num")
}