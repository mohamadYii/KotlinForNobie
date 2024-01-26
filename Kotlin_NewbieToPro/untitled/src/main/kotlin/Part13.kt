fun main(){
    val myArr = arrayOf(1,2,3)
    for(i in myArr){
       println(i)
    }
    for(i in 1..3){
        println(i)
    }
    for(i in 'a'..'z'){
        println(i)
    }
    for(i in 10 downTo 5){
        println(i)
    }
    for(i in 10 downTo 5 step 2){
        println(i)
    }
    var max = myArr[0]
    for (i in myArr){
        if (i > max){
            max = i
        }
    }
    println(max)
    //////////////////////////////////
    val myArr2 = arrayOf(2,5,20)
    var result= 0

    for (i in myArr2){
        result += i
    }
    println("The sum of arr is:$result")
    ///////////////////////////////////
    var result2 = 0F
    var userArr = arrayOf(0F,0F,0F,0F,0F)
    var w = 0
    println("Enter 5 numbers:")
    while (w < 5){
        val rd = readLine()?.toFloat()
        if (rd !=null){
            userArr[w]=rd
        }
        w++
    }
    for (i in userArr){
        result2+=i
    }
    result2 /= 5F
    println("The average value is $result2")
}