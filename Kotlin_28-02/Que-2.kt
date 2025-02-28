// Count even and odd numbers in list
fun main(){
    var myList = mutableListOf<Int>()
    var evencount = 0
    var oddcount = 0
    println("Enter your total values here :")
    var numbers = readLine()!!.toInt()
    for(i in 1..numbers){
        println("Enter your $i value: ")
        var input = readLine()!!.toInt()
        myList += input
    }
    for(j in myList){
        if(j % 2 ==0){
            evencount++
        }else{
            oddcount++
        }
    }
    
    println(evencount)
    println(oddcount)
}