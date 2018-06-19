fun main(args : Array<String>){
    var range = 1..5    //1,2,3,4,5

    var range2 = 5 downTo 1     //5,4,3,2,1

    var range3 = 5 downTo 1 step 2 //5,3,1

    var range4 = 5.downTo(0)

    for(x in range3)
            println(x)


    var name : String = "Sholom"

    if(name.equals("sholom",true))
        print("True")
    else
        print("False")


    var strNum : String = "4"
    println(strNum.toInt())
    println(strNum.length)
    println(name.substring(0..3))

    
    println("Name = $name")
}