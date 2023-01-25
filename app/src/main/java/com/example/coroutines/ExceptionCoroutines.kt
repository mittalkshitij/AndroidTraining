package com.example.coroutines

import kotlinx.coroutines.*


fun main(): Unit = runBlocking {


    val obj : Deferred<String> = GlobalScope.async{

        networkCall()
        "user returned"
    }

    try {
        val user = obj.await()
        println(user)
    }catch (e: Exception){
        println(e)
    }

}

suspend fun networkCall(){

    println("Network Call")
    delay(2000)
}

