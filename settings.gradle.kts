rootProject.name = "spring-java-multi-module-template"
include("support:logging")

pluginManagement {
    val springBootVersion : String by settings
    val springDependencyManagementVersion : String by settings
    plugins {
        id("org.springframework.boot") version springBootVersion
        id("io.spring.dependency-management") version springDependencyManagementVersion
        id("spring-java-multi-module-template.java-conventions")
    }
}
