plugins {
    id("java")
    kotlin("jvm") version "1.8.10"
    groovy
}

group = "com.retreat.code"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.codehaus.groovy:groovy-all:3.0.15")

    testImplementation("org.spockframework:spock-core:2.4-M1-groovy-3.0")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.2")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.9.2")
    testImplementation("org.assertj:assertj-core:3.24.2")
    testImplementation("io.strikt:strikt-core:0.34.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.2")

    testImplementation("org.mockito:mockito-core:5.1.1")
    testImplementation("org.mockito:mockito-junit-jupiter:5.1.1")

    testImplementation("io.mockk:mockk:1.13.4")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}