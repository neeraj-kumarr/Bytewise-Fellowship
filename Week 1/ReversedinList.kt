fun main() {

    val list = mutableListOf<Int>()
    println("Enter a number greater than 1")
    val x = readLine()?.toInt()
    
   for (i in 1..5){
       val x = readLine()?.toInt()
      	 if(x!=null){
       		list.add(x)
     	}
   }

   val reversedList = list.reversed().toMutableList()
   for (i in reversedList){
   println(i)}
}