package com.learn.kotlin.KotTutorial

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun kotlinCoroutein04() = runBlocking{
    val job = launch { // launch a new coroutine and keep a reference to its Job
        delay(1000L)
        println("World!")
    }
    print("Hello ")
    job.join() // wait until child coroutine completes
    println("Done!")
}

/*
Theory
A launch coroutine builder returns a Job object that is a handle to the launched coroutine and can be used to explicitly wait for its completion.
For example, you can wait for completion of the child coroutine and then print "Done" string:
* */