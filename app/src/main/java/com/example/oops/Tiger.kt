package com.example.oops

class Tiger(){
    var legs = 4
    fun makesSound(){
        println("tiger makes sound")
    }
    inner class InnerClass(){
        fun innerfun(){
            println("inner function" +" legs = "+ legs ) // we can use the data members of outer class using inner class
        }
    }
}

fun main(){

    var innerclass = Tiger().InnerClass()
    innerclass.innerfun()

    var tiger = Tiger()
    println(tiger.legs)
    tiger.makesSound()

}
