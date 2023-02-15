package com.retreat.code

import org.junit.jupiter.api.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class KotlinClassTest() {

    private val kotlinClass = KotlinClass()

    @Test
    fun `getHelloWorld should return some string`() {
        expectThat(kotlinClass.getHelloWorld()).isEqualTo("hello world from kotlin")
    }
}