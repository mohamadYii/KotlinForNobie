fun main(){
    val max = getMax(1,2,3)
    searchFor("how to become rich?")
    searchFor("how to become rich?","Bing")
    searchFor(search = "how to become rich?", searchEngine = "Bing")
    val sum = alternatingSum(3,4,5,2,1,2,3)
    println(sum)
}
fun getMax(vararg number: Int):Int{
    var max = number[0]
    for (i in number){
        if (i > max){
            max = i
        }
    }
    return max
}
fun searchFor(search:String, searchEngine: String="Google"){
    println("Searching for $search on $searchEngine")
}
/////////////////////////
fun alternatingSum(vararg numbers:Int):Int{
    var sum = 0
    var counter=0
    for (i in numbers){
        if (counter%2==0){
           sum+=i
        }else{
            sum-=i
        }
        counter++
    }
    return sum
}