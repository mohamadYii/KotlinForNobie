fun main() {
    var i = 0
    while (i < 10) {
        println("this is $i time")
        i++
    }
    println(i)
    i = 0
    val myArr = arrayOf("Hi", "lets", "Dance")
    val arrLength = myArr.size
    while (i < arrLength) {
        println(myArr[i])
        i++
    }
    ///////////////////////////////////
    print("Enter a number: ")
    val userInputInt = readLine()
    var j = userInputInt?.toInt()
    println("\nlets count from $userInputInt down to 0!!")
    while (j != null && j >= 0) {
        println(j)
        j--
    }

///////////////////////////////////
    print("Enter a number1: ")
    var userInputInt1 = readLine()
    print("\nEnter a number2: ")
    var userInputInt2 = readLine()
    if (userInputInt1 != null && userInputInt2 != null) {
        val a = userInputInt1.toInt()
        var b = userInputInt2.toInt()
        var result = a
        while (b - 1 > 0) {
            result *= a
            b--
        }
        println("$a to the power of $b is $result")
    }
}
