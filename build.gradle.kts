plugins {
    id("java")
}

group = "za.co.wethinkcode"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.fasterxml.jackson.core:jackson-databind:2.10.3")
    implementation("info.picocli:picocli:4.6.2")
    implementation("com.google.code.gson:gson:2.10.1")
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.mockito:mockito-core:3.8.0")
}

tasks.test {
    useJUnitPlatform()
}