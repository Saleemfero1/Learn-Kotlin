package com.learn.kotlin.KotTutorial

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun KotlinCoroutein05() = runBlocking{
    repeat(50_000){
        launch {
            delay(5000L)
            print(".")
        }
    }
}

/*
Coroutines are less resource-intensive than JVM threads.
Code that exhausts the JVM's available memory when using threads can be expressed using coroutines without hitting resource limits.
For example, the following code launches 50,000 distinct coroutines that each waits 5 seconds and then prints a period ('.') while consuming very little memory:
* */