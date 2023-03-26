abstract class Vehicle(val make: String = "", val model: String = "", val year: Int = 0, val color: String = "") {
    abstract fun hell0(): String
}

class Car(
    make: String = "",
    model: String = "",
    year: Int = 0,
    color: String = "",
    val numDoors: Int = 0,
    val numPassengers: Int = 0,
    val hasSunroof: Boolean = false
) : Vehicle(make, model, year, color) {

    override fun hell0(): String {
        return "This Vehicle is $make, $model, $year, in $color color, Number of passengers: $numPassengers, Num of Doors: $numDoors, Sunroof? $hasSunroof"
    }
}

class Truck(
    make: String = "",
    model: String = "",
    year: Int = 0,
    color: String = "",
    val payloadCapacity: Double = 0.0,
    val towingCapacity: Double = 0.0
) : Vehicle(make, model, year, color) {

    override fun hell0(): String {
        return "This Vehicle is $make, $model, $year, in $color color, Payload: $payloadCapacity, towing Capacity: $towingCapacity"
    }
}

fun main() {
    var myCar = Car("Toyota", "Vitz", 2018, "Black", 5, 5, false)
    var myTruck = Truck("Ford", "F-150 Shelby", 2020, "Yellow", 20000.0, 50000.0)

    println(myCar.hell0())
    println(myTruck.hell0())
}
