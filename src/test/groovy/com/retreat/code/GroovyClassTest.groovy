package com.retreat.code

import spock.lang.Specification

class GroovyClassTest extends Specification{

    def "getHelloWorld should return some string"() {
        given: "the test setup"
        def groovyClass = new GroovyClass()

        when: "the action happens"
        var actual = groovyClass.helloWorld

        then: "the result should match"
        actual == "hello world from groovy"
    }
}
