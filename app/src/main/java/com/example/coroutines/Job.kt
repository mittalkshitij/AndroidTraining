package com.example.coroutines

import kotlinx.coroutines.*

fun main()= runBlocking{

    println("Starts on ${Thread.currentThread().name}")

        var job: Job= GlobalScope.launch{

        println("Worker Thread starts on ${Thread.currentThread().name}")

        for (i in 1..10) {
            println(i)
            delay(1000)
        }
        println("Worker Thread ends on ${Thread.currentThread().name}")
    }

    delay(5000)
    job.cancel()  // will cancel after 5 seconds
    job.join()

    println("Ends on ${Thread.currentThread().name}")

}

suspend fun makeNWcall1(time :Long) {

    delay(time)
}