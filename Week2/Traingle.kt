import kotlin.math.sqrt

class Triangle(
    val a : Double,
    val b : Double,
    val c : Double
) {
    init {
        println("Traingle created with a = $a, b = $b, c = $c")
        println("Triangle Area is ${area()}")
        println("Triangle Perimeter is ${perimiter()}")
    }

    private fun perimiter()  = a + b + c
    private fun area() = sqrt( perimiter()/2  * ((perimiter()/2)-a) *  ((perimiter()/2)-b) * ((perimiter()/2)-c))
}

// Main Function


fun main(){
    val myTriangle = Triangle(2.0,4.0,3.0)
    println(myTriangle)
}