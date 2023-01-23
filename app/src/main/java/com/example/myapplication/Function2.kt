package com.example.myapplication

fun findMax(a : Int, b: Int) :  Int =
    if(a>b){
        println("a is greater")
        a
    }else
    {
        println("b is greater")
        b
    }

fun calculateArea(length : Int, breadth : Int){

    fun rectArea():Int{

        return length*breadth;
    }

    print(rectArea())
}

var ans = fun(name : String){
    println("name is $name")
}

val data : Int
get() {
    return 100
}


fun main(){

    //findMax(4,5)
   // calculateArea(4,5)

    var arr= arrayOf(1,2,4,5,66,77,88,99)

    println(arr.filter { it % 2 ==0 })

    println(arr.map { it * 10 })

    println(arr.reduce{ a, arr -> a + arr})

    ans("kshitij")

    println(data)
}