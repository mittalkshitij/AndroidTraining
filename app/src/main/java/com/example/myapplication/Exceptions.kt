package com.example.myapplication

fun multipleCatchBlocks(){
    try {

        val div=5/0
        println(div)

        var array= IntArray(5)
        array.get(6)

    }catch (e:ArithmeticException){
        println(e)
    }catch (e:ArrayIndexOutOfBoundsException){
        println(e)
    }
}

fun nestedTryCatch(){

    val numbers = arrayOf(1,2,3,4)

    try {
        for (i in numbers.indices) {
            try {
                var n = (0..4).random()
                println(numbers[i+1]/n)

            } catch (e: ArithmeticException) {
                println(e)
            }
        }
    } catch (e: ArrayIndexOutOfBoundsException) {
        println(e)
    }finally {
        println("this code always executes")
    }

}

fun throwException(){

    var age=15;

    if(age<18)
        throw Exception("invalid age")
    else
        println("valid age")
}
fun main(){

    //multipleCatchBlocks()

    //nestedTryCatch()

    throwException()

}