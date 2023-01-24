package com.example.oops.inheritance

open class Animal{

    constructor(){

        println("parent constructor")

    }
    var legs = 4
    open fun makingSound(){
        println("animal makes sound")
    }
}


class Tiger : Animal{

    constructor(){
        println("child constructor")
        println(super.legs)
        println(super.makingSound())
    }

    lateinit var animal: Animal
    lateinit var name: String

    fun tigersound() {
        name = "TIGER"
        println("tiger name is $name " + " and legs is " +legs)
    }

    override fun makingSound() {
        println("tiger makes sound")
        super.makingSound()
    }
}

fun main(){

    var objTiger=Tiger()
    objTiger.tigersound()
    objTiger.makingSound()


}