plugins {
    id("com.android.application")
    kotlin("android")
    id("kotlin-android-extensions")
    id("org.jlleitschuh.gradle.ktlint")
    id("com.gladed.androidgitversion") version "0.4.13"
}

android {
    compileSdkVersion(30)
    buildToolsVersion = "30.0.0"

    defaultConfig {
        applicationId = "com.mengx.alarm.wakemeup"
        minSdkVersion(23)
        targetSdkVersion(30)
        versionCode = if (androidGitVersion.code() == 0) {
            1
        } else {
            androidGitVersion.code()
        }

        versionName = androidGitVersion.name()

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }

    buildFeatures {
        dataBinding = true
        viewBinding = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    sourceSets {
        getByName("main").java.srcDir("src/main/kotlin")
        getByName("androidTest").java.srcDir("src/androidTest/kotlin")
        getByName("debug").java.srcDir("src/debug/kotlin")
        getByName("test").java.srcDir("src/test/kotlin")
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(kotlin("stdlib"))
    implementation("androidx.core:core-ktx:1.3.0")
    implementation("androidx.appcompat:appcompat:1.1.0")
    implementation("androidx.constraintlayout:constraintlayout:1.1.3")
    testImplementation("junit:junit:4.13")
    androidTestImplementation("androidx.test.ext:junit:1.1.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.2.0")
}