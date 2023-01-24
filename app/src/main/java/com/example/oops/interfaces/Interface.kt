package com.example.oops.interfaces

interface ITigerInterface{

    fun eating()

    fun running(){
        println("tiger is running")
    }
}

interface ILionInterface{

    fun eating()

    fun running(){

        println("lion is running")
    }

}

class Animal: ITigerInterface ,ILionInterface {

    override fun eating() {
    println("eating")
    }

    override fun running() {
    println("running")
        println(super<ILionInterface>.running())
    }

}

fun main(){

    var obj=Animal()

    obj.running()
    obj.eating()
}