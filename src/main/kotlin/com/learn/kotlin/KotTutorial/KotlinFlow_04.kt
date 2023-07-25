package com.learn.kotlin.KotTutorial

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

fun simpleFour(): Flow<Int> = flow { // flow builder
    for (i in 1..20) {
        delay(100) // pretend we are doing something useful here
        emit(i) // emit next value
    }
}
/*
Flows
Using the List<Int> result type, means we can only return all the values at once. To represent the stream of values that are being computed asynchronously, we can use a Flow<Int> type just like we would use a Sequence<Int> type for synchronously computed values:


fun simple(): Flow<Int> = flow { // flow builder
    for (i in 1..3) {
        delay(100) // pretend we are doing something useful here
        emit(i) // emit next value
    }
}

fun main() = runBlocking<Unit> {
    // Launch a concurrent coroutine to check if the main thread is blocked
    launch {
        for (k in 1..3) {
            println("I'm not blocked $k")
            delay(100)
        }
    }
    // Collect the flow
    simple().collect { value -> println(value) }
}

This code waits 100ms before printing each number without blocking the main thread. This is verified by printing "I'm not blocked" every 100ms from a separate coroutine that is running in the main thread:

I'm not blocked 1
1
I'm not blocked 2
2
I'm not blocked 3
3

Notice the following differences in the code with the Flow from the earlier examples:

A builder function of Flow type is called flow.

Code inside a flow { ... } builder block can suspend.

The simple function is no longer marked with a suspend modifier.

Values are emitted from the flow using an emit function.

Values are collected from the flow using a collect function.
* */


