package com.example.collections

fun main(){

    var list= listOf<String>("Kshitij","Harshit","Sidd")

    for(element in list){
        println(element)
    }

    println(list.get(2))
    println(list.size)
    println(list.contains("Sidd"))
    println(list.subList(1,3))
    println(list.isEmpty())
}