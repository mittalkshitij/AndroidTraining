package com.example.collections

fun main(){

    var mList= mutableListOf<String>("Kshitij","Harshit","Sidd")

    for(ele in mList)
        println(ele)

    println("-------------------")

    mList.add("simran")
    mList.add("twesha")
    mList.add("tanya")

    println("-------------------")

    for(ele in mList)
        println(ele)

    println("-------------------")

    mList.removeAt(2)

    for(ele in mList)
        println(ele)


}