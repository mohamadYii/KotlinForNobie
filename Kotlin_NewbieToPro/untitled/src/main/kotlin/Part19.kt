fun main(){
    val number = 7
    val listOfNumbers = listOf(1,2,3,4,5,6)
    println(number.isPrime())
    println(listOfNumbers.fac())
}
fun Int.isPrime():Boolean{
    for (i in 2 until this -1){
        if (this % i == 0){
            return false
        }
    }
    return true
}
//////////////////////////
fun List<Int>.fac():Int{
    var result = 1
    for (i in this){
        result*=i
    }
    return result
}
