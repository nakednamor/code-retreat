package com.retreat.code;

public class JavaClass {

    public static void main(String... args) {
        var javaClass = new JavaClass();
        System.out.println(javaClass.getHelloWorld());
    }


    public String getHelloWorld() {
        return "hello world from java";
    }
}
