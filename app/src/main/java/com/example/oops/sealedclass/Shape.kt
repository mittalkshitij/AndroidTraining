package com.example.oops.sealedclass

sealed class Shape() {

    data class Circle(var radius : Int) : Shape()

    data class Rectangle(var length : Int, var breadth : Int) : Shape()
}

fun main(){

    var circle = Shape.Circle(4)
    var rectangle = Shape.Rectangle(5,4)

    checkShape(rectangle)
}

fun checkShape(shape: Shape){

    when(shape){

        is Shape.Circle -> println("Area of circle is ${shape.radius * shape.radius * 3.14}")
        is Shape.Rectangle -> println("Area of rectable is ${shape.breadth * shape.length}")

    }

}