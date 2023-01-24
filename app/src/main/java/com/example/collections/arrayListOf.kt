package com.example.collections

fun main(){

    var anyArrayList: ArrayList<Any> = arrayListOf<Any>(1,2,3,"Kshitij","Harshit","Sidd")

    for(ele in anyArrayList)
        println(ele)

    println("-----------------")

    val itr = anyArrayList.iterator()
    while(itr.hasNext()) {
        println(itr.next())
    }

    println("-----------------")



}