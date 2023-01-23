package com.example.myapplication

fun main(){

    val x="hello world"
    val y="hello world"

    if(x===y)   //  === is used to compare address
        println(1)
    else
        println(0)

    val str = "Hello, javatpoint!"
    println(str[0])
    println(str[1])
    println(str[str.length-1])

    // raw string
    val a = 10
    val b = 5

    val myString = """value $a  
        |is greater than value $b  
    """
    println("${myString.trimMargin()}")

}