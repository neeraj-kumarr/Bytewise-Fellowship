import kotlin.random.Random


fun main() {


//    val rect = Rectangle.randomRectangle()
//    val circle = Circle(6.0)
//    val maxAreaRectangleCircle = maxArea(rect, circle)
//    println("The max area between Rectangle and Circle is : $maxAreaRectangleCircle")

    //Function Overloading through constructors

//    fun maxArea(shape1: Shape, shape2: Shape): Double{
//        val areashape1 = shape1.area()
//        val areashape2 = shape2.area()
//
//        return if(areashape1 > areashape2){
//            areashape1
//        } else{
//            areashape2
//        }
//    }



//    Try and Catch Error

/*   println("Enter a number for radius of circle")
    var input = readLine()?.toDouble()
    if(input != null) {
        val circle = try {
            println(Circle(input))
        } catch (e: NegativeRadiusException) {
            0.0
        }
        println(circle)
    } */


    
/*
    val a = Random.nextDouble(1.0, 10.0)
    val b = Random.nextDouble(1.0, 10.0)
    val c = Random.nextDouble(1.0, 10.0)
    val d = Random.nextDouble(1.0, 10.0)
    val height = Random.nextDouble(1.0, 10.0)

//    Anonymous Class
    val trapeze = object : Shape("Trapeze", a, b, c, d, height) {
        init {
            print("Trapeze created with a = $a, b = $b,c = $c,d = $d,height = $height")
            println("The area is ${area()}")
            println("The area is ${perimeter()}")
        }


        override fun area(): Double {
            return (a + c )*height / 2.0
        }

        override fun perimeter(): Double {
            return a + b + c + d
        }

        fun isTrapeze(): Boolean = a==c && b==d
    }

    print("Is the Trapeze rectangle or Not? ${trapeze.isTrapeze()} ")
*/
}
