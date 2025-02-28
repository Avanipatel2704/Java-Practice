// Find Intersection of two sets 

fun main(){
    var mySet = mutableSetOf<Int>()
    println("Enter your total values for set 1 here :")
    var numbers = readLine()!!.toInt()
    for(i in 1..numbers){
        println("Enter your $i value: ")
        var input = readLine()!!.toInt()
        mySet += input
    }
    var mySet2 = mutableSetOf<Int>()
    println("Enter your total values for set 2 here :")
    var numbers2 = readLine()!!.toInt()
    for(i in 1..numbers2){
        println("Enter your $i value: ")
        var input2 = readLine()!!.toInt()
        mySet2 += input2
    }
    var intersection = mySet.intersect(mySet2)
    println(intersection)
    
}