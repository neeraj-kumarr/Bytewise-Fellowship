import java.lang.Exception

class Circle (
    val radius: Double
): Shape("Circle")
{
    private val pi = 3.142
    init {
        if(radius < 0.0){
            throw NegativeRadiusException()
        }
        println("$name created with radius = $radius")
        println("The Area of Circle is ${area()}")
        println("The Perimeter of Circle is ${perimeter()}")
    }

    override fun area(): Double  = radius * radius * pi

    override fun perimeter(): Double  = 2 * radius *pi
}

class NegativeRadiusException : Exception("Please enter a positive number")

