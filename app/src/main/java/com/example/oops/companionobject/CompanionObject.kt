package com.example.oops.companionobject

class MyClass{

    infix fun myFun(name : String){   // infix function accepts only one parameter

        println("the name is $name")
    }

    companion object{   // works as static in java
        var legs=4

        fun myMethod(){
            println("my method")
        }
    }
}

//Singleton
object MyObj{

    init {
        println("singleton class")
    }

    var name: String= "kshitij"

    fun add(n1:Int, n2:Int) {

        println("addition is "+ n1.plus(n2))
     }
}

fun main(){

//    println (MyClass.legs)
//    MyClass.myMethod()

//    var obj=MyClass()
//    obj.myFun("Kshitij")
//    obj myFun "Kshitij"   // infix is used just for readability

    var obj1 = MyObj
    var obj2= MyObj

    println(obj1.toString())
    println(obj2.toString())

    println(MyObj.name)
    MyObj.add(3,4)



}