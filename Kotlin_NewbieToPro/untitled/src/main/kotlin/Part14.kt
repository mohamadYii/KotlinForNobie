fun main() {
    val myArr = arrayOf(1, 2, 3)
    val myList = listOf(1, 2, 3)
    val myListM = mutableListOf(1, 2, 3)
    myArr[2] = 3
    //myList[0]=2 not working
    myListM.add(4)
    // mutable list can add or remove but in array the size cant be changed
    myListM.remove(3)
    myListM.removeAt(2)

    val inputList = mutableListOf<Int>()
    for (i in 1..10) {
        val x = readLine()?.toInt()
        if (x != null) {
            inputList.add(x)
        }
    }
print(inputList)


///////////////////////////////////////////
    val inputList2 = mutableListOf<Int>()
    println("please enter 5 number:")
    for (i in 1..5){
        val s = readLine()?.toInt()
        if (s!=null) {
            inputList2.add(s)
        }
    }
    println(inputList2.reversed())

    /////////////////////////////////////
    var fibo = mutableListOf(0,1)
    println("Enter a number n>1:")
    val userInputI= readLine()?.toInt()
    if (userInputI!=null){
        for (i in 1..userInputI-2){
            fibo.add(fibo[i-1]+fibo[i])
        }
    }
    println(fibo)
}