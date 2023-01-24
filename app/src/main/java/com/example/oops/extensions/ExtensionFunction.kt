package com.example.oops.extensions

// Kotlin gives the programmer the ability to add more functionality
// to the existing classes, without inheriting them
// using extension function

class Rectangle(var breadth: Int, var length : Int){


}

fun Rectangle.area(){

    println("the area of rectangle is ${length*breadth}")
}

fun Rectangle.perimeter(){

    println("the perimeter of rectangle is ${2*(length+breadth)}")
}

fun main(){

    var obj = Rectangle(4,5)

    obj.area()
    obj.perimeter()



}