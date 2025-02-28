// Sum of elements in a list 

fun main(){
    var myList = mutableListOf<Int>()
    println("Enter the total numbers :")
    var numbers = readLine()!!.toInt()
    
    for(i in 1..numbers){
        println("Enter the $i value :")
        var input = readLine()!!.toInt()
        myList += input
    }
    var sum = myList.sum()
    println(sum)

}
