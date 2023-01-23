package com.example.myapplication

import java.util.Collections.swap

fun sorting(array: IntArray) : IntArray{

    println(array.size)

    var swap = true
    while(swap){
        swap = false
    for(i in 0 until array.size-1) {
        if(array[i]> array[i+1]) {
            val temp = array[i]
            array[i] = array[i + 1]
            array[i + 1] = temp

            swap = true
            }
        }
    }
    return array
}

fun reversing(array: IntArray) : IntArray{

    var low = 0
    var high = array.size - 1
    while (low < high)
    {
        val temp = array[low]
        array[low] = array[high]
        array[high] = temp

        low++
        high--
    }
    return array
}

fun main(){

    // Find the second largest element without using in-built functions
    var arr= intArrayOf(6,34,2,77,56,88,4)

    var array=sorting(arr)

    for (k in array) print("$k ")
    println("\n The second largest element is ${array[array.size-2]}")

    //Reverse the Array

    val array1=reversing(arr)
    println("The reverse of the array is"+array1.contentToString())



}