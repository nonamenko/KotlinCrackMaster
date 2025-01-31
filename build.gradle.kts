plugins {
    kotlin("jvm") version "1.5.30"
    application
}

group = "com.yourusername"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}

application {
    mainClass.set("KotlinCrackMasterKt")
}
