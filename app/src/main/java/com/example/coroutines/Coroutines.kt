package com.example.coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


fun main()= runBlocking{

    println("Starts on ${Thread.currentThread().name}")

    //Ways of starting coroutines
    //1) Launch
    GlobalScope.  //-- will not be required if running already on coroutines
    launch{

        println("Worker Thread starts on ${Thread.currentThread().name}")

        //Thread.sleep(2000)  // will block your thread
        //delay(2000)  // will not block the thread..is part of coroutines
        makeNWcall(3000)

        println("Worker Thread ends on ${Thread.currentThread().name}")

    }

    //2)runBlocking -- used for testing
/*    runBlocking {
        delay(3000)  // is used instead of Thread.sleep -- will use the scope of the thread which is running
    }*/
    //Thread.sleep(3000)

    println("Ends on ${Thread.currentThread().name}")

}

suspend fun makeNWcall(time :Long){

    delay(time)
}