package com.learn.kotlin.KotTutorial

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotTutorialApplication

fun main(args: Array<String>)  = runBlocking<Unit>{
	runApplication<KotTutorialApplication>(*args)
	println("Calling simple function...")
	val flow = simpleFive()
	println("Calling collect...")
	flow.collect { value -> println(value) }
	println("Calling collect again...")
	flow.collect { value -> println(value) }
}

