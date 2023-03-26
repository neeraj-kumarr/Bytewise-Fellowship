fun main(){
    val list = mutableListOf(5,6,4,2,9,2,8,3)
    println(" The Product of $list is ${list.listProduct()}")
}

fun List<Int>.listProduct(): Int {
    var result = 1
    for (i in this){
        result *= i
    }
    return result
}