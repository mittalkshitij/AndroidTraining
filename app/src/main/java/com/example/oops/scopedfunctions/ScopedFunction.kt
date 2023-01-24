package com.example.oops.scopedfunctions

class Tiger(){
    var legs=4
    var age=20

    fun running(){
        println("tiger is running")
    }

    fun eating(){
        println("tiger is eating")
    }
}

fun main() {

    var tiger=Tiger()
    println(tiger.legs)
    tiger.eating()
    tiger.running()

    Tiger().apply {
        println(legs)
        eating()
        running()
    }

    // with is used when we used to return object

    var res=with(tiger){

        println(age)
        var newAge= age+10

        newAge
    }
    println(res)

    //let

    tiger.let {
        println(it.legs)
        it.eating()
        it.running()
    }

    // run - if it is null it will not go inside the block

    var res1= tiger.run {

        var newAge1=res+10
        newAge1
    }
    println(res1)

    // also

    var mArr= mutableListOf<Int>(3,4,5,6,7)

    mArr.also {
        it.add(100)
        it.removeAt(2)
    }

    println(mArr)
}