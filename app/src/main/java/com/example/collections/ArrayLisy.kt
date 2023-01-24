package com.example.collections

fun main(){

    val arrayList = ArrayList<String>(5)

    arrayList.add("kshitij")
    arrayList.add("harshit")
    arrayList.add("sidd")
    arrayList.add("tanya")
    arrayList.add("twesha")

    for(ele in arrayList)
        println(ele)

    println("Size of Array List is "+arrayList.size)

    arrayList.set(2,"simran")

    println(arrayList.get(2))

    println("Index of Tanya is ${arrayList.indexOf("tanya")}")

    arrayList.add("sidd")

    for(ele in arrayList)
        println(ele)

    println("The Last Index of Sidd is ${arrayList.lastIndexOf("sidd")}")

    arrayList.clear()

    for(ele in arrayList)
        println(ele)


}