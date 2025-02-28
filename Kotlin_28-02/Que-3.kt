// Remove duplicates from a List using Set 

fun main() {
    var list = mutableListOf<Int>()
    println("Enter your total values here :")
    var numbers = readLine()!!.toInt()
    for(i in 1..numbers){
        println("Enter your $i value: ")
        var input = readLine()!!.toInt()
        list += input
    }
    val uniqueList = list.toSet().toList()

    println(uniqueList) 
}