fun main(){
    val x = 5
    val y = 5
    println(x == y)
    println(x < y)
    println(x > y)
    println(x <= y)
    println(x >= y)
    println(x != y)


    val a = 3
    val b = 7

    println(x == y && a == b)
    println(x == y || a == b)
    println(!(x == y) || (a == b))
    println(!(x == y || a == b))
    /////////////////////////////////
    println(3 > 4 || 4>3 && 4<=4)
    println(!(9!=9)&& true || 9>(9+3) && (false || 3<9))
}