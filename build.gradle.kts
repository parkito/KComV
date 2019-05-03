
group = "ru.siksmfp.KcomV"
version = "0.1.1"

val appArchiveName = "KComV-$version"

plugins {
    application
    kotlin("jvm") version "1.3.20"
}

application {
    mainClassName = "samples.HelloWorldKt"
}

dependencies {
    compile(kotlin("stdlib"))
    implementation("ch.qos.logback:logback-classic:1.2.3")
}

repositories {
    jcenter()
    mavenCentral()
}

val jar by tasks.getting(Jar::class) {
    archiveName = "$appArchiveName.jar"
    into("META-INF") {
    }
}

