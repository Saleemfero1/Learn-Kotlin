package com.learn.kotlin.KotTutorial

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun task() = runBlocking {
    launch {
        delay(1000L)
        println("world")
    }
    println("Hello")
}


/* Theory
---------------->Your first coroutine<--------------------
Link : https://kotlinlang.org/docs/coroutines-basics.html#your-first-coroutine

->launch is a coroutine builder. It launches a new coroutine concurrently with the rest of the code,
which continues to work independently. That's why Hello has been printed first.

->delay is a special suspending function. It suspends the coroutine for a specific time.
Suspending a coroutine does not block the underlying thread, but allows other coroutines to run and use the underlying thread for their code.

->runBlocking is also a coroutine builder that bridges the non-coroutine world of a regular fun main() and the code with coroutines inside of runBlocking { ... } curly braces.
This is highlighted in an IDE by this: CoroutineScope hint right after the runBlocking opening curly brace.

The name of runBlocking means that the thread that runs it (in this case — the main thread) gets blocked for the duration of the call, until all the coroutines inside runBlocking { ... } complete their execution.
You will often see runBlocking used like that at the very top-level of the application and quite rarely inside the real code, as threads are expensive resources and blocking them is inefficient and is often not desired.

Structured concurrency
Coroutines follow a principle of structured concurrency which means that new coroutines can only be launched in a specific CoroutineScope which delimits the lifetime of the coroutine.
The above example shows that runBlocking establishes the corresponding scope and that is why the previous example waits until World! is printed after a second's delay and only then exits.

NOTE: In a real application, you will be launching a lot of coroutines.
Structured concurrency ensures that they are not lost and do not leak.
An outer scope cannot complete until all its children coroutines complete.
Structured concurrency also ensures that any errors in the code are properly reported and are never lost.

* */
