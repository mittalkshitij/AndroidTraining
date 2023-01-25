package com.example.coroutines

import kotlinx.coroutines.*

fun main() :Unit = runBlocking{

        //val obj:Deferred<String> =
        //GlobalScope.
        launch {

        try {

                val usersDeferred = async {

                    getUsers()
                    "returning user"
                }

                val moreUsersDeferred = async {
                getMoreUsers()
                "returning more users"
                }

                val users = usersDeferred.await()
                val moreUsers = moreUsersDeferred.await()

                println(users)
                println(moreUsers)

        } catch (exception: Exception) {
            println(exception)
        }

        "final return"

    }
    //println(obj)
}

suspend fun getMoreUsers() {
    println("Getting More User")
    delay(2000)
}

suspend fun getUsers() {

    println("Getting Users")
    delay(2000)
}
