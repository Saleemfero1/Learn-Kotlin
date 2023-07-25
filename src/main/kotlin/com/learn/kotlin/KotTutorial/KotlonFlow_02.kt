package com.learn.kotlin.KotTutorial

/*
Sequences
If we are computing the numbers with some CPU-consuming blocking code (each computation taking 100ms), then we can represent the numbers using a Sequence


fun simple(): Sequence<Int> = sequence { // sequence builder
    for (i in 1..3) {
        Thread.sleep(100) // pretend we are computing it
        yield(i) // yield next value
    }
}

fun main() {
    simple().forEach { value -> println(value) }
}
This code outputs the same numbers, but it waits 100ms before printing each one.
* */

fun simpleOne(): Sequence<Int> = sequence { // sequence builder
    for (i in 1..3) {
        Thread.sleep(1000) // pretend we are computing it
        yield(i) // yield next value
    }
}
