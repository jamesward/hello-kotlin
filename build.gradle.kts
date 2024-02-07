plugins {
    application
    kotlin("jvm") version "2.0.0-Beta3"
}

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(21)
}

application {
    mainClass = "MainKt"
}
