// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        jcenter()
        maven {
            url = uri("https://plugins.gradle.org/m2/")
        }
    }
    dependencies {
        classpath(Dependencies.GradleTools)
        classpath(kotlin("gradle-plugin", version = Versions.Kotlin))
        classpath("org.jlleitschuh.gradle:ktlint-gradle:9.3.0")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

plugins {
    id(PlugIns.KlintGradle) version Versions.KlintGradle
    id(PlugIns.KlintIdeaGradle) version Versions.KlintGradle
}

ktlint {
    version.set(Versions.Klint)
    debug.set(true)
    verbose.set(true)
    android.set(true)
    outputToConsole.set(true)
    ignoreFailures.set(true)
    enableExperimentalRules.set(true)
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}