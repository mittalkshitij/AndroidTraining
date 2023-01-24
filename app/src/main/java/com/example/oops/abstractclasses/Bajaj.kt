package com.example.oops.abstractclasses

abstract class Bajaj() {

    abstract fun security()

    abstract fun mask()


}

class HardwareEmployee() : Bajaj(){

    override fun security() {
        println("fingerprints")
    }

    override fun mask() {
        println("n95 mask")
    }

}

class SoftwareEmployee() : Bajaj(){

    override fun security() {
        println("id card")
    }

    override fun mask() {
        println("n30 mask")
    }

}

fun main(){

    var obj1=HardwareEmployee()
    var obj2=SoftwareEmployee()

    println(obj1.mask())
    println(obj1.security())

    println(obj2.mask())
    println(obj2.security())




}

