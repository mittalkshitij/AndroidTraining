package com.example.oops.constructor

class Tiger(var name : String){

    var eyes : Int = 0
    init {
        eyes = 2
        println("eyes of the tiger is $eyes")
    }

    var legs = 4
    fun makesSound(){
        println("tiger makes sound and name is $name")
    }
}

fun main() {

    var tiger = Tiger("TIGER")
}