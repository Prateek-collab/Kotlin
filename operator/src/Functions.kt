/*syntax
fun funName(arg1:Type1,arg2:Type2..):ReturnType{
lines of ccode
return result
example:- fun Sum(a:Int,b:Int):Int
}*/

fun main(){
    newFunction()
    println(timesTwo(23))

}

//'Unit',when there is no return value datatype(ommitable).

/*
fun newFunction():Unit{
    println("I am your new function")
}*/

//We can also write the return type=expession
fun newFunction()=println("I am your new function")

//fun timesTwo(x:Int)=x*2
fun timesTwo(x:Int):Int{
    val output=x*2
    return output
}

