object Versions {
    const val Kotlin = "1.3.72"
    const val GradleTools = "4.0.1"
    const val KlintGradle = "9.3.0"
    const val Klint = "0.37.2"
}

object Dependencies {
    const val GradleTools = "com.android.tools.build:gradle:${Versions.GradleTools}"
    const val KlintGradle = "org.jlleitschuh.gradle:ktlint-gradle:${Versions.KlintGradle}"
}

object PlugIns {
    const val KlintGradle = "org.jlleitschuh.gradle.ktlint"
    const val KlintIdeaGradle = "org.jlleitschuh.gradle.ktlint-idea"
}