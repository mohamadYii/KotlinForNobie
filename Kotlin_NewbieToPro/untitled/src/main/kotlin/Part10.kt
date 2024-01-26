fun main(){
    val userInput = readLine()
    println(userInput?.toInt())
    ///////////////////////////
    val ageInput = readLine()
    if (ageInput != null){
        if (ageInput.toInt()<18){
            println("Your not a adult yet")
        }else if (18 <= ageInput.toInt() && ageInput.toInt() < 65){
            println("Your adult")
        }else{
            println("Your old as f")
        }
    }
}