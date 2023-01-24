package com.example.oops.constructor

class Tiger1(name : String){

    init {
        println("tiger name is $name")
    }

    constructor() : this("Ansari"){
        println("secondary constructor")
    }
    constructor(id : Int) : this("TIGER"){
        println("my id is $id")
    }

    constructor(college : String, id : Int) : this(id){
        println("my college is $college and id is $id")
    }


}

fun main(){

    var tiger = Tiger1("ABC", 101)





}