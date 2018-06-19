class student{
    var name : String = ""
    var num : Long = 0
    var school : String? = null

    fun print(){
        println("Name: $name")
        println("num: $num")
    }

    fun assign(newName : String, newNum : Long){
        name = newName
        num = newNum
    }
}