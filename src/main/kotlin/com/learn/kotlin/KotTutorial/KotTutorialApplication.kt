package com.learn.kotlin.KotTutorial

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeoutOrNull
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotTutorialApplication

fun main(args: Array<String>)  = runBlocking<Unit>{
	runApplication<KotTutorialApplication>(*args)
	withTimeoutOrNull(350) { // Timeout after 250ms
		simpleSix().collect { value -> println(value) }
	}
	println("Done")
}

