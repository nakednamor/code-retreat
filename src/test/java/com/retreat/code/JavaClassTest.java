package com.retreat.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class JavaClassTest {

    private JavaClass javaClass;

    @BeforeEach
    public void setupBeforeEach() {
        javaClass = new JavaClass();
    }

    @Test
    public void getHelloWorld() {
        assertThat(javaClass.getHelloWorld()).isEqualTo("hello world from java");
    }
}
