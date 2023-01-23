package com.example.myapplication

fun main(){

    val x="hello world"
    val y="hello world"

    if(x===y)   //  === is used to compare address
        println(1)
    else
        println(0)

    val str = "Hello world"
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

    var s="kshitij"
    var str1="kshitij"
    println(s.get(3))
    println(s.subSequence(1, 4))
    println(s.compareTo(str1))  // will return 0 if two strings are equal

}