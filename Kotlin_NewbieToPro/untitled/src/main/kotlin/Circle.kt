import kotlin.random.Random

class Circle public constructor(
    val radius: Double
): Shape("circle") {
    private val pi = 3.141592
    companion object{
        fun randomCircle():Circle{
            val radius = Random.nextDouble(1.0,10.0)
            return Circle(radius)
        }
    }
    init {
        println("$name created with radius = $radius")
        println("$name area is ${area()}")
        println("$name perimeter is ${perimeter()}")
    }

    override  fun area()= radius*radius*pi
    override  fun perimeter()= 2*radius*pi
}