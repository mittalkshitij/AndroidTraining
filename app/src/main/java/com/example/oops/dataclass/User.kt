package com.example.oops.dataclass

class NUser(var name : String, var age : Int){

    override fun toString(): String {
        return "NUser(name='$name', age=$age)"
    }
}

data class User(var name : String, var age : Int){


}


fun main(){

    var nU1 = NUser("abc", 22)
    var nU2 = NUser("abc", 22)

    if(nU1 == nU2){
        println("both equal")
    }
    else{
        println("not equal")
    }

    println(nU1.toString())

    var nUd1 = User("abc", 22)
    var nUd2 = User("abc", 22)

    if(nUd1 == nUd2){
        println("both equal")
    }
    else{
        println("not equal")
    }

    println(nUd1)
}