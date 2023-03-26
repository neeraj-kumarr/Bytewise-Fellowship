import kotlin.random.Random

class Rectangle (val a: Double,
                 val b: Double): Shape("Rectangle"){

    constructor(a: Double) : this (a,a)
    constructor(a: Int, b: Int): this (a.toDouble(),b.toDouble())

//    Companion objects used for defining methods and properties of class without having instance of class
    companion object{
        fun randomRectangle(): Rectangle {
            val sideA = Random.nextDouble(5.0,9.0)
            val sideB = Random.nextDouble(1.0,4.0)
            return Rectangle(sideA,sideB)
        }
    }

    init {
        print("$name created with a = $a and b = $b")
        println("The area is ${area()}")
        println("The area is ${perimeter()}")
    }

    override fun area(): Double = a * b
    override fun perimeter(): Double = 2 * (a+b)

    fun isSquare() = a == b
}