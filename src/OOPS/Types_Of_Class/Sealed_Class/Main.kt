package OOPS.Types_Of_Class.Sealed_Class

fun main() {
//    cannot create object of Sealed Class As it is abstract by default
//    val result = Result()

    val loading = Result.Loading()
    val failure = Failure()
    val success = Success()

    checkState(success)

}


fun checkState(state: Result) {
    println("Current State = " +
        when (state) {
            is Failure -> "Failed"
            is Result.Loading -> "Loading"
            is Success -> "Success"
            // Here No Need to use else part because all the subclasses of Sealed Class
            // are in same file, and we have mentioned each subclass in when statement
        }
    )
}


// Subclass of Sealed Class can be only created within the same file
// we can not create subclass of sealed class outside the file
// In This manner , we can manage our code more efficiently
// Sealed Class are Abstract by Default

// Here we defined number of possible subclass
sealed class Result() {
    class Loading : Result()
}

class Success : Result()

class Failure : Result()