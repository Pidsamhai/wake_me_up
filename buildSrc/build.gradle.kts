import org.gradle.kotlin.dsl.`kotlin-dsl`

plugins {
    `kotlin-dsl`
}

repositories {
    jcenter()
}

sourceSets{
    getByName("main").java.srcDir("src/main/kotlin")
}