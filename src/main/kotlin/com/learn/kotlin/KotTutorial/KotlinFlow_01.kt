package com.learn.kotlin.KotTutorial




fun simple(): List<Int> = listOf(1, 2, 3)


/*Asynchronous Flow
A suspending function asynchronously returns a single value, but how can we return multiple asynchronously computed values? This is where Kotlin Flows come in.

===============Multiple values can be represented in Kotlin using collections.===========

For example, we can have a simple function that returns a List of three numbers and then print them all using forEach:

fun simple(): List<Int> = listOf(1, 2, 3)

fun main() {
    simple().forEach { value -> println(value) }
}

*/


