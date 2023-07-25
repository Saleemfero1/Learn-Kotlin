package com.learn.kotlin.KotTutorial

import kotlinx.coroutines.runBlocking
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotTutorialApplication

fun main(args: Array<String>)  = runBlocking{
	runApplication<KotTutorialApplication>(*args)
	simpleThree().forEach { value -> println(value) }
}
