package com.learn.kotlin.KotTutorial

import kotlinx.coroutines.delay
suspend fun simpleThree(): List<Int> {
    delay(1000) // pretend we are doing something asynchronous here
    return listOf(1, 2, 3,4,5,6)
}

/*
Suspending functions

However, this computation blocks the main thread that is running the code.
When these values are computed by asynchronous code we can mark the simple function with a suspend modifier,
so that it can perform its work without blocking and return the result as a list:

suspend fun simple(): List<Int> {
    delay(1000) // pretend we are doing something asynchronous here
    return listOf(1, 2, 3)
}

fun main() = runBlocking<Unit> {
    simple().forEach { value -> println(value) }
}

* */

