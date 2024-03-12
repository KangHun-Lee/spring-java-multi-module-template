plugins {
    id("org.springframework.boot")
    id("io.spring.dependency-management")
    id("spring-java-multi-module-template.java-conventions")
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("io.micrometer:micrometer-tracing-bridge-brave") {
        exclude(group = "io.zipkin.reporter2")
    }
}