
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        maven(url = uri("https://jitpack.io"))
        maven( url = uri("https://maven.google.com") )
        maven( url = uri("https://plugins.gradle.org/m2/") )
    }
}
rootProject.name = "AndroidStarter"
include(":app")
