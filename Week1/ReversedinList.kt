fun main() {

    var list = mutableListOf<Int>()
      	
    println("Enter any five numbers ")
        for (i in 1..5){
            var x = readLine()?.toInt()
             if(x!=null){
            list.add(x)
            }
    }

    println("The reversed numbers are: ")
   var reversedList = list.reversed().toMutableList()
   for (i in reversedList){
   println(i)}
    

}
