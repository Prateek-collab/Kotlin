fun main(){
    val s="Welcome to Internshala"
    //string function
    val strlength= s.length

    //string function
    val stringindex=s.get(12)

    println(s)
    println(strlength)

    /*print("The character at position 12 is:")
    println(stringindex)*/

    //use string templates
    //println("$name has scored $num goals")
    println("Te character at index 12 is ${s.get(12)}")
    //slicing
    println{s.subSequence(0,7)}

    val i = 10
    println("The value of i is $i")

}