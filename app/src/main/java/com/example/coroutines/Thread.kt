package com.example.coroutines

import kotlin.concurrent.thread

fun main(){

    // Application runs and ends on Main Thread
    println("Starts on ${Thread.currentThread().name}")

    //Ways of Creating Thread
    //1)
    var t =Thread(object :Runnable{
        override fun run() {
            println("Thread : ${Thread.currentThread().name}")
        }
    }).start()

    //2)
    thread {

        println("Worker thread starts on ${Thread.currentThread().name}")
        Thread.sleep(2000)

        println("Worker Thread ends on ${Thread.currentThread().name}")
    }


    println("Ends on ${Thread.currentThread().name}")
}