// Count frequency of words in a list 

fun main(){
    var list = mutableListOf<String>()
    println("Enter your total values here :")
    var numbers = readLine()!!.toInt()
    for(i in 1..numbers){
        println("Enter your $i value: ")
        var input = readLine().toString()
        list += input
    }
    println("Enter the word you want to search :")
    var word_input = readLine().toString()
    var count = list.count{it == word_input}
    println(count)
}