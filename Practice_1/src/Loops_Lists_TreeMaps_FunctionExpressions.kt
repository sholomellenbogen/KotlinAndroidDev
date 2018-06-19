import java.util.*

fun main(args : Array<String>){
    var list = listOf(11,12,13,14,15)

    for ((i,x) in list.withIndex())
        println(i.toString() + " " + x)



    var tree = TreeMap<String,Int>()
    tree["Sholom"] = 200
    tree["Bob"] = 300

    for ((name,score) in tree)
        println(name + score.toString())


    var a = 3
    var b = 5
    println(add(a,b))
}

//long form function
//    fun add(a:Int,b:Int) :Int {
//        return a+b
//    }

//short form function expression
fun add(a:Int,b:Int) :Int = a+b