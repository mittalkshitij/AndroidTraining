package com.example.myapplication

fun mul(a : Int, b : Int):Int{

    return a*b
}


fun mySum(a : Int, b: Int) : Int{
    return a + b
}

var mylam : (Int, Int) -> Unit = { a, b -> a + b
println("hello")
}

inline fun calculations(x : Int, y :Int, somefun :(Int, Int) -> Unit){
    var add = somefun(x,y)
    println(add)
}

fun cal() : (Int, Int) -> Int{
    return ::mul
}

fun arrFun(array: Array<Int>){

    for (i in array)
        println(i)
}

var lambArr : (Array<Int>) -> Unit = {

    for (i in it)
        println(i)
}

fun function1(){

    println("This is a normal function")
}



fun main(){

    /*var res = mylam(4,5)
    println(res)*/

/*    calculations(2,3, mylam)
    var myres = cal()

    println(myres(4,5))*/

    var arr = arrayOf(1,2,3,4,5)

//    arrFun(arr)

    lambArr(arr)






}
