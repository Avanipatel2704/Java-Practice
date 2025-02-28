// Find the maximum and minimum in a List 

fun main(){
    var list = mutableListOf<Int>()
    println("Enter your total values here :")
    var numbers = readLine()!!.toInt()
    for(i in 1..numbers){
        println("Enter your $i value: ")
        var input = readLine()!!.toInt()
        list += input
    }
    var minimum_value = list.min()
    var maximum_value = list.max()
    println(minimum_value)
    println(maximum_value)
}