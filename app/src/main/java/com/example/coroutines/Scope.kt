package com.example.coroutines

import kotlinx.coroutines.*


fun main(): Unit= runBlocking{

    println("runblocking scope $this")

    GlobalScope.launch {
        println("launch scope $this")
    }

    GlobalScope.async {
     println("async scope $this")
    }
}