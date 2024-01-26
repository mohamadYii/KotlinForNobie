fun main() {
    printThreeLines()
    printPow(3, 3)
    sumOfval(5)
}

fun printPow(base: Int, exponent: Int) {
    var result = 1
    for (i in 1..exponent) {
        result *= base
    }
    println("result: $result")
}

fun printThreeLines() {
    println("First")
    println("Second")
    println("Third")
}
//////////////////////
fun sumOfval(highestVal:Int){
    var result=0
    for(i in 1..highestVal){
        result+=i
    }
    print(result)
}