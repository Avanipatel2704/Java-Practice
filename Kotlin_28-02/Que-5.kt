// Iterate over a map and print key-value pairs 

fun main(){
    var myMap = mutableMapOf<Int , String>()
    println("Enter your count:")
    var count = readLine()!!.toInt()
    for(i in 1..count) {
        print("Enter your key here for $i :")
        var key = readLine()!!.toInt()
        print("Enter your Value here for $key : ")
        var value = readLine().toString()
        myMap[key] = value
    }
    print(myMap)
}