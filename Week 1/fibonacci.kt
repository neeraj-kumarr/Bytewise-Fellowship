fun main() {

    val list = mutableListOf(0,1) 
    println("Enter a number greater than 1")
    val x = readLine()?.toInt()
    var sum = 0
    
        if(x!=null){
          for (i in 1..x){
        sum += i 
        list.add(sum)
        }
    }
    println(list)

  
}