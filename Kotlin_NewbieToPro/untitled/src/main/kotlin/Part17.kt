fun main() {
    //print(printPow2(3, 3))
    //multiply(2,3)
    var a = listOf(3,2,5,1,5,6,7)
    print(searchForItem(a,7))
}

fun printPow2(base: Int, exponent: Int): Int  {
    var result = 1
    for (i in 1..exponent){
        result *= base
    }
    return result
}
fun multiply(a:Int , b:Int)= a*b
fun printFirstItem(list: List<Int>) = println(list[0])
///////////////////
fun searchForItem(list: List<Int>,num:Int):Int{
    var indexOfValue =0;
    for (i in 0 until list.count()){
        if (num==list[i]){break}
        indexOfValue++
    }
    return indexOfValue
}