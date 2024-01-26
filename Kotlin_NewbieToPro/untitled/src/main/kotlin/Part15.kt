fun main(){
    val age = readLine()?.toInt()
    when(age){
        in 0..5 -> println()
        in 6..17 -> println()
        18 -> {
            println()
        }
        19,20 -> println()
        else -> println()
    }
    val name = readLine()
    when(name){
        "nick" -> println("hey nick!")
    }
    ////////////////////////////
    val wuf = readLine()
    when(wuf){
        "Russia" -> println("privet")
        "USA" -> println("hello")
        "India" -> println("namaste")
        "Germany" -> println("hallo")
        else -> println("idk")
    }
}