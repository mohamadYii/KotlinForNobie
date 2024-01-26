fun main(){
    val x = 5
    val y = 7
    if(x < y || y * y ==49){
        println("at least one of the condition is true")
    }else if (x >y){
        println("X is greater then y")
    }else{
        println("x is equal to y")
    }

    val z = if (x +y ==14) 3 else 4
    println("the value of z is $z")

    /////////////////////////////////////////
    val palindrome_test = "mamad"
    println("The string is $palindrome_test")
    if (palindrome_test == palindrome_test.reversed()){
        println("The string $palindrome_test is a palindrome")
    } else{
        println("The string $palindrome_test is not a palindrome")
    }
}