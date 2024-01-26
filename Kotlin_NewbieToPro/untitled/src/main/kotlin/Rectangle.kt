import kotlin.random.Random

class Rectangle(
    val a:Double,
    val b:Double
    ):Shape("Rectangle"){
        companion object{
            fun randomRec():Rectangle{
                val a = Random.nextDouble()
                val b = Random.nextDouble()
                return Rectangle(a,b)
            }
        }

        constructor(a:Double): this(a,a)
        constructor(a:Int,b:Int): this(a.toDouble(),b.toDouble())

    init {
        println("$name created!")
    }
    override fun area()= a*b
    override fun perimeter()= 2*a+2*b
    fun isSquare() = a==b
}