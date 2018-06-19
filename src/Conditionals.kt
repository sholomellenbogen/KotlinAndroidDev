fun main(args : Array<String>){
    var a = 2
    var b = 4

    var result : Int = 0

    result = if (a>b)
        a
    else
        b

    println(result)
    var resultStr : String = ""
    resultStr = when(a){
        1 -> "a=1"
        2-> "a=2"
        else-> "NOT FOUND"
    }
    println("resultStr")
//    if (a==b)
//        println("a == b")
//    else
//        println("a != b")





}