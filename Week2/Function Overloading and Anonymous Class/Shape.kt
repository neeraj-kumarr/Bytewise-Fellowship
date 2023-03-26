import java.awt.Dimension

//Abstract classes are used to let sub classes inherit from it, but it's instances class cannot be made because it's an abstract class
abstract class Shape(var name: String){

    constructor(name: String, vararg dimensions: Double) : this(name)

    init {
        println("I am the super class")
    }
    abstract fun area(): Double
    abstract fun perimeter(): Double

//    To change the names for different shapes
    fun changeName(newName: String){
    name = newName
}
}

