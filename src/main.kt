fun main(){
    word()
   var y = calc("Catherine",20)
    println(y)
    var x = length("Mombasa")
    println(x)
    myname()

}
//function that prints out a string composed of the first,third and fourth characters of a String
fun word(){
    var name = "akiraChix"
    println(name[1].toString()+name[3]+name[4])
}
/*function that takes in two parameters,name and age and return a String with this Structure"Hi my name is x and
i am y years old*/
fun calc(name:String,age:Int):String{
    var stmt = "Hi my name is $name and am years $age old"
    return(stmt)
}
//function that takes in a String and returns its length
fun length(name:String):Int{
    var size = name.length
    return size

}
/*function that takes in a name and prints out "That's me"when your name is passed to it,otherwise prints out
"I don't know who that is"*/
fun myname(){
    var name = "Kanini"
    if(name=="Kanini"){
        println("That's me")
    }
    else
        println("I don't know who that is")
}

