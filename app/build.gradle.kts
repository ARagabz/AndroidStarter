import dependencies.DebugDependencies
import dependencies.Dependencies
import dependencies.TestAndroidDependencies
import dependencies.TestDependencies

plugins {
    id(BuildPlugins.ANDROID_APPLICATION)
    id("kotlin-android")
    id(BuildPlugins.KOTLIN_KAPT)
    id(BuildPlugins.NAVIGATION_SAFE_ARGS) // navigation component
//    id(BuildPlugins.DAGGER_HILT)
}

android {
    compileSdkVersion(BuildAndroidConfig.COMPILE_SDK_VERSION)
    buildToolsVersion = BuildAndroidConfig.BUILD_TOOLS_VERSION

    defaultConfig {
        applicationId = BuildAndroidConfig.APPLICATION_ID

        minSdkVersion(BuildAndroidConfig.MIN_SDK_VERSION)
        targetSdkVersion(BuildAndroidConfig.TARGET_SDK_VERSION)

        versionCode = BuildAndroidConfig.VERSION_CODE
        versionName = BuildAndroidConfig.VERSION_NAME
        // enable multiDex
        multiDexEnabled = true

        vectorDrawables.useSupportLibrary = BuildAndroidConfig.SUPPORT_LIBRARY_VECTOR_DRAWABLES
        testInstrumentationRunner = BuildAndroidConfig.TEST_INSTRUMENTATION_RUNNER
    }
    signingConfigs {
        create(BuildTypes.RELEASE.type) {
            storeFile = file("keystore/starter_keystore.jks")
            storePassword = ApplicationSigning.PASSWORD
            keyAlias = ApplicationSigning.KEY
            keyPassword = ApplicationSigning.PASSWORD
        }

        getByName(BuildTypes.DEBUG.type) {
            storeFile = file("keystore/starter_keystore.jks")
            storePassword = ApplicationSigning.PASSWORD
            keyAlias = ApplicationSigning.KEY
            keyPassword = ApplicationSigning.PASSWORD
        }
    }
    buildTypes {
        getByName(BuildTypes.RELEASE.type) {
            isMinifyEnabled = false
            isDebuggable = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
            )
            signingConfig = signingConfigs.getByName(BuildTypes.RELEASE.type)
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
    buildFeatures {
        dataBinding = true
        viewBinding = true
    }
}

dependencies {

    // kotlin stdlib and reflection
    implementation(Dependencies.KOTLIN)
    implementation(Dependencies.KOTLIN_REFLECT)
    // core_ktx
    implementation(Dependencies.CORE_KTX)
    // app_compat
    implementation(Dependencies.APPCOMPAT)
    // google_material
    implementation(Dependencies.MATERIAL)
    // constraint_layout
    implementation(Dependencies.CONSTRAIN_LAYOUT)
    implementation(Dependencies.LEGACY_SUPPORT)

    // junit
    testImplementation(TestDependencies.JUNIT)
    //android_test
    androidTestImplementation(TestAndroidDependencies.JUNIT)
    androidTestImplementation(TestAndroidDependencies.ESPRESSO)


}