// Reverse a list using loop 

fun main(){
    var list = mutableListOf<Int>()
    var reversedlist = mutableListOf<Int>()
    println("Enter your total values here :")
    var numbers = readLine()!!.toInt()
    for(i in 1..numbers){
        println("Enter your $i value: ")
        var input = readLine()!!.toInt()
        list += input
    }
    for(j in list){
        reversedlist.add(0,j)
    }
    println("Reversed List :" + reversedlist)
    
}