package com.example.myapplication

/*
data class example(val user: String, val ID: Int, val city: String)

fun main(args: Array<String>) {
    println("Welcome To My Domain its a first example for regarding the lambda function")
    val demo = listOf(
        example("first user", 1, "your location is chennai"),
        example("second user", 2, "your location is tiruppur"),
        example("third user", 3, "your location is mumbai"),
        example("fourth user", 4, "your location is andhra"),
        example("fifth user", 5, "your location is jammu"),
        example("sixth user", 6, "your location is kahmir"),
        example("seventh user", 7, "your location is madurai"),
        example("eigth user",8, "your location is karnataka"),
        example("ninth user", 9, "your location is delhi"),
        example("tenth user", 10, "your location is west bengal"),
    )
    val demo1 = demo
        .filter { it.user.startsWith("f") }
        .minBy{ it.ID }
    println(demo1)
    println("Your input user lists are : ${demo1?.user}" )
    println("The user IDs are shown: ${demo1?.ID}" )
    println("city: ${demo1?.city}" )
    println("Thank you users for spenting the time with our application " +
            "kindly try and spent more with our application its useful for your knowledge")
}*/

val eg = fun(a: Int, b: Int): Int = a + b
val eg1 = fun(a: Int, b: Int): Int {
    val resultmul = a * b
    return resultmul
}
val eg2 = fun(a: Int, b: Int): Int = a - b

fun main(args: Array<String>){
    val demo: (Int) -> Unit= {s: Int -> println(s) }
    val sum = eg(7,9)
    val resultmul = eg1(7,9)
    val minus = eg2(7,9)
    println("Thank you users the sum of two numbers is: $sum")
    println("Thank you users the multiply of two numbers is: $resultmul")
    println("Thank you users the subtraction of two numbers is: $minus")
    val new = { println("Thank you for using the lambda concepts in the application!")}
    new()
    new.invoke()
    val new1 = arrayOf(17,7,9)
    new1.forEach { unknown -> println(unknown * unknown) }
    new1.forEach { println(it*it) }


}
fun demo1(a: Int, b: Int, demo: (Int) -> Unit ){
    val add = a + b
    demo(add)
}
fun demo2(a: Int, b: Int, demo: (Int) -> Unit ){
    val sub = a - b
    demo(sub)
}