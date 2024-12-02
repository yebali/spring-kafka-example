plugins {
    id("yebali.kotlin.spring-web")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.kafka:spring-kafka")
}