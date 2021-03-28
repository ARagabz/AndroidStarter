object BuildPlugins {
    const val ANDROID_APPLICATION = "com.android.application"
    const val ANDROID_DYNAMIC_FEATURE = "com.android.dynamic-feature"
    const val ANDROID_LIBRARY = "com.android.library"

    const val KOTLIN = "kotlin"
    const val JAVA_LIBRARY = "java-library"
    const val KOTLIN_ANDROID_EXTENSIONS = "kotlin-android-extensions"
    const val KOTLIN_KAPT = "kotlin-kapt"
    const val KOTLIN_ALLOPEN = "kotlin-allopen"

    const val DAGGER_HILT = "dagger.hilt.android.plugin"
    const val GOOGLE_SERVICES = "com.google.gms.google-services"
    const val CRASHLYTICS = "com.google.firebase.crashlytics"

    const val NAVIGATION_SAFE_ARGS = "androidx.navigation.safeargs.kotlin"
    const val JACOCO = "com.vanniktech.android.junit.jacoco"
    const val GRAPH_GENERATOR = "com.vanniktech.dependency.graph.generator"

    const val DETEKT = "io.gitlab.arturbosch.detekt"
    const val DOKKA = "plugins.dokka"
    const val GIT_HOOKS = "plugins.git-hooks"
    const val KTLINT = "plugins.ktlint"
    const val SPOTLESS = "plugins.spotless"
    const val UPDATE_DEPENDENCIES = "com.github.ben-manes.versions"
}

object BuildProductDimensions {
    const val ENVIRONMENT = "environment"
}

object BuildTasksGroups {
    const val ANDROID = "android"
    const val BUILD = "build"
    const val BUILD_SETUP = "build setup"
    const val CLEANUP = "cleanup"
    const val DOCUMENTATION = "documentation"
    const val FORMATTING = "formatting"
    const val GIT_HOOKS = "git hooks"
    const val HELP = "help"
    const val INSTALL = "install"
    const val OTHER = "other"
    const val REPORTING = "reporting"
    const val VERIFICATION = "verification"
}


object BuildAndroidConfig {

    const val APPLICATION_ID = "com.ragabz.androidstarter"
    const val MIN_SDK_VERSION = 23
    const val TARGET_SDK_VERSION = 30
    const val COMPILE_SDK_VERSION = 30

    const val VERSION_CODE = 3
    const val VERSION_NAME = "1.0"
    const val BUILD_TOOLS_VERSION = "30.0.3"
    const val SUPPORT_LIBRARY_VECTOR_DRAWABLES = true

    const val TEST_INSTRUMENTATION_RUNNER = "androidx.test.runner.AndroidJUnitRunner"


    const val BASE_URL = "\"\""

}

enum class BuildTypes(val type: String) {
    RELEASE("release"),
    DEBUG("debug")
}

object ApplicationSigning {
    const val KEY = "key"
    const val PASSWORD = "ragabz"
}