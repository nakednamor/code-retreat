package com.retreat.code

class GroovyClass {

    static void main(String[] args) {
        def groovyClass = new GroovyClass()
        println groovyClass.helloWorld
    }

    String getHelloWorld() {
        return "hello world from groovy"
    }
}
