fun main() {
    println("Enter Number 1")
    val var1 = readLine()?.toDouble()
    
    println("Enter Operator (+,-,*,/)")
    val op = readLine()
    
    println("Enter Number 2")
    val var2 = readLine()?.toDouble()
	
    if (var1 == null || var2 == null) {
        println("Invalid Input")
        return
    }
    
    val result = when(op) {
        "+" -> var1 + var2
        "-" -> var1 - var2
        "*" -> var1 * var2
        "/" -> var1 / var2
        else -> {
            println("Invalid Operator! Please Choose (+,-,*,/)")
            return
        }
    }
    
    println("Result: $result")
}
