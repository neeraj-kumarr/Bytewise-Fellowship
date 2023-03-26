fun main() {
    val sum = alternatingSum(5,3,6,8,2,5,69,65,25)
    println("The altering sum is $sum")
}
fun alternatingSum(vararg numbers: Int): Int{
    var result = 0
    for (i in numbers.indices){
//        Even and Odd index logic is used
        if (numbers[i] % 2 == 0) {
            result += i
        } else{
            result -= i
        }
    }
    return result
}