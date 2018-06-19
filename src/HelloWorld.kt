fun main(args : Array<String>){

    var name : String = "BillyGoats"    //declaring variable

    val constantVar : Int = 2;  //constants
    var num = 9;        //shorthand
    println("Hello " + name)

    println("Max Value: " + Int.MAX_VALUE)
    println("Max Value: " + Int.MIN_VALUE)


    var myArr = arrayOf("Hello",1,1.234)

    var definedArr : Array<Int> = arrayOf(1,2,3)

    for(x in myArr)
        println(x)
}