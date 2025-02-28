// Filter Element from a list 

fun main(){
    var list = mutableListOf<Int>()
    var filteredlist = mutableListOf<Int>()
    println("Enter your total values here :")
    var numbers = readLine()!!.toInt()
    for(i in 1..numbers){
        println("Enter your $i value: ")
        var input = readLine()!!.toInt()
        list += input
    }
    for(i in list){
        if(i >= 10){
            filteredlist.add(i)
        }
    }
    println(list)
    println("Filtered list :" + filteredlist)
}