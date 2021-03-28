
plugins {
    id(BuildPlugins.DETEKT).version(Versions.DETEKT)
    id(BuildPlugins.UPDATE_DEPENDENCIES).version(Versions.VERSIONS_PLUGIN)
}

buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        maven( url = uri("https://jitpack.io") )
        maven( url = uri("https://maven.google.com") )
        maven( url = uri("https://plugins.gradle.org/m2/") )
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.0.0-alpha12")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.31")
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.3.4")
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.33-beta")
        classpath("com.github.dcendents:android-maven-gradle-plugin:2.1")
        classpath("com.google.gms:google-services:4.3.5")
        classpath("com.google.firebase:firebase-crashlytics-gradle:2.5.1")
    }
}


subprojects {
    tasks.withType<Test> {
        maxParallelForks = (Runtime.getRuntime().availableProcessors() / 2).takeIf { it > 0 } ?: 1
    }

    apply {
        // KtLint
        from("$rootDir/ktlint.gradle")
        // Detekt
        from("$rootDir/detekt.gradle")
    }
}
// JVM target applied to all Kotlin tasks across all sub-projects
tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = JavaVersion.VERSION_1_8.toString()
}

tasks.register("clean", Delete::class.java) {
    delete(rootProject.buildDir)
}

tasks.withType<com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask> {
    rejectVersionIf {
        isNonStable(candidate.version)
    }
}

fun isNonStable(version: String) = "^[0-9,.v-]+(-r)?$".toRegex().matches(version).not()