package com.example.myapplication

fun main(){

    var name : String? = null
    println("name is $name")
    println("length is ${name?.length}")

    var college : String? = "abc"
    college = null

    // !! non null assertion operator
   /* var college1 : String? = "abc"
    println("college length is ${college1!!.length}")
    var college2 : String? = null
    println("college length is ${college2!!.length}")*/

    /*if(college != null) {
        println("${college?.length}")
    }else{
        println("-1")
    }*/

    // elvis operator
    var res = college?.length ?: -1
    println(res)

    college="abc"

    // let block will be entered if its not null.. is used to check for null values
    college?.let {
      println("${college?.length}") // will print 3
    }

    println("continue of the program")

    var name1 : Any? = "abcd"
    var age : Int? = name1 as? Int // will print null
    println(age)

    println("end of the program")
}