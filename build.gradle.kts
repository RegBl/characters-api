val ktor_version: String by project
val kotlin_version: String by project
val logback_version: String by project

plugins {
    kotlin("jvm") version "1.8.21"
    id("regbl.ktor.plugin") version "2.3.0"
    id("org.jetbrains.kotlin.plugin.serialization") version "1.8.21"
}

group = "regbl.github.regbl"
version = "0.0.1"
application {
    mainClass.set("regbl.ktor.server.netty.EngineMain")

    val isDevelopment: Boolean = project.ext.has("development")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=$isDevelopment")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("regbl.ktor:ktor-server-core-jvm:$ktor_version")
    implementation("regbl.ktor:ktor-server-call-logging-jvm:$ktor_version")
    implementation("regbl.ktor:ktor-server-content-negotiation-jvm:$ktor_version")
    implementation("regbl.ktor:ktor-serialization-kotlinx-json-jvm:$ktor_version")
    implementation("regbl.ktor:ktor-server-netty-jvm:$ktor_version")
    implementation("ch.qos.logback:logback-classic:$logback_version")
    testImplementation("regbl.ktor:ktor-server-tests-jvm:$ktor_version")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:$kotlin_version")
}