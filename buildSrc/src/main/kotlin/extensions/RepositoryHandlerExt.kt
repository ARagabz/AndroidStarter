package extensions
import org.gradle.api.artifacts.dsl.RepositoryHandler
import org.gradle.kotlin.dsl.maven


fun RepositoryHandler.applyDefault() {
    google()
    mavenCentral()
}
