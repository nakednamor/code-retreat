package com.retreat.code

fun main(args: Array<String>) {
    val kotlinClass = KotlinClass()
    println(kotlinClass.getHelloWorld())
}

class KotlinClass {
    fun getHelloWorld(): String = "hello world from kotlin"
}