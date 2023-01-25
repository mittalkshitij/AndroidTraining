package com.example.coroutines

import kotlinx.coroutines.*

fun main()= runBlocking{

    println("Starts on ${Thread.currentThread().name}")

    //Ways of creating coroutines

    //3)Async -- used when we are getting a response or result returning

    var job: Deferred<String> = GlobalScope.async{

        println("Worker Thread starts on ${Thread.currentThread().name}")
        delay(2000)
        println("Worker Thread ends on ${Thread.currentThread().name}")

        "result from server"
    }

    var data=job.await()
    println(data)


    println("Ends on ${Thread.currentThread().name}")

}

