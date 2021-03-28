package dependencies

/**
 * Dependencies
 */
object Dependencies {
    const val KOTLIN = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.KOTLIN}"

    const val KOTLIN_REFLECT =
        "org.jetbrains.kotlin:kotlin-reflect:${Versions.KOTLIN}"
    const val KOTLIN_COLLECTION =
        "androidx.collection:collection-ktx:${Versions.COLLECTION_KTX}"

    const val APPCOMPAT = "androidx.appcompat:appcompat:${Versions.APPCOMPAT}"

    const val MATERIAL =
        "com.google.android.material:material:${Versions.MATERIAL}"

    const val RECYCLE_VIEW =
        "androidx.recyclerview:recyclerview:${Versions.RECYCLE_VIEW}"

    const val CORE_KTX = "androidx.core:core-ktx:${Versions.CORE_KTX}"

    const val FRAGMENT_KTX =
        "androidx.fragment:fragment-ktx:${Versions.FRAGMENT_KTX}"

    const val CONSTRAIN_LAYOUT =
        "androidx.constraintlayout:constraintlayout:${Versions.CONSTRAIN_LAYOUT}"

    const val LEGACY_SUPPORT = "androidx.legacy:legacy-support-v4:1.0.0"

    const val SWIPE_REFRESH_LAYOUT =
        "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.SWIPE_REFRESH_LAYOUT}"

    const val TIMBER = "com.jakewharton.timber:timber:${Versions.TIMBER}"

    const val MOSHI = "com.squareup.moshi:moshi:${Versions.MOSHI}"

    const val MOSHI_KTX = "com.squareup.moshi:moshi-kotlin:${Versions.MOSHI}"

    const val COIL = "io.coil-kt:coil:${Versions.COIL}"

    const val PLAY_CORE = "com.google.android.play:core:${Versions.PLAY_CORE}"



    const val ANDROIDX_ANNOTATIONS = "androidx.annotation:annotation:1.1.0"

    const val PREFERENCE = "androidx.preference:preference:1.1.1"

    const val CARD_VIEW = "androidx.cardview:cardview:1.0.0"

    const val VIEW_PAGER2 = "androidx.viewpager2:viewpager2:1.0.0"

    const val MULTIDEX = "androidx.multidex:multidex:${Versions.MULTIDEX}"

    const val GLIDE = "com.github.bumptech.glide:glide:4.12.0"

    const val GLIDE_COMPILER = "com.github.bumptech.glide:compiler:4.12.0"

    const val SECURITY_CRYPTO = "androidx.security:security-crypto:1.0.0-alpha02"

    const val CIRCULAR_IMAGE_VIEW =
        "de.hdodenhof:circleimageview:${Versions.CIRCULAR_IMAGEVIEW}"

    const val VIEW_BINDING_UTIL = "com.github.matsudamper:ViewBindingUtil:0.1"

    const val RX_PERMISSIONS = "com.github.tbruyelle:rxpermissions:0.12"

    const val CIRCLE_INDICATOR = "me.relex:circleindicator:2.1.6@aar"
    const val ANDROID_SHAPE_IMAGEVIEW = "com.github.siyamed:android-shape-imageview:0.9.3"

    const val IMAGE_PICKER  = "com.github.dhaval2404:imagepicker:1.8"
    const val INLINE_ACTIVITY_RESULT  = "com.github.florent37:inline-activity-result-kotlin:1.0.4"
    const val THREE_TEN_APP  = "com.jakewharton.threetenabp:threetenabp:1.3.0"

    const val EVENT_BUS  = "org.greenrobot:eventbus:3.2.0"

    object Dagger {
        // core
        const val DAGGER = "com.google.dagger:dagger:${Versions.DAGGER}"
        const val DAGGER_COMPILER =
            "com.google.dagger:dagger-compiler:${Versions.DAGGER}"

        // android
        const val DAGGER_ANDROID =
            "com.google.dagger:dagger-android:${Versions.DAGGER}"
        const val DAGGER_ANDROID_SUUPORT =
            "com.google.dagger:dagger-android-support:${Versions.DAGGER}"
        const val DAGGER_ANDROID_PROCESSOR =
            "com.google.dagger:dagger-android-processor:${Versions.DAGGER}"

        // hilt
        const val HILT = "com.google.dagger:hilt-android:${Versions.DAGGER_HILT}"
        const val HILT_COMPILER =
            "com.google.dagger:hilt-android-compiler:${Versions.DAGGER_HILT}"
    }

    object LIFECYCLE {
        const val VIEWMODEL_KTX =
            "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.LIFECYCLE}"

        const val LIVEDATA_KTX =
            "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.LIFECYCLE}"

        const val LIFECYCLE_RUNTIME =
            "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.LIFECYCLE}"

        const val LIFECYCLE_VIEWMODEL_SAVEDSTATE =
            "androidx.lifecycle:lifecycle-viewmodel-savedstate:${Versions.LIFECYCLE}"

        const val LIFECYCLE_COMPILER =
            "androidx.lifecycle:lifecycle-common-java8:${Versions.LIFECYCLE}"

        const val LIFECYCLE_SERVICE =
            "androidx.lifecycle:lifecycle-service:${Versions.LIFECYCLE}"

        const val LIFECYCLE_PROCESS =
            "androidx.lifecycle:lifecycle-process:${Versions.LIFECYCLE}"

        const val LIFECYCLE_REACTIVE_STREAMS =
            "androidx.lifecycle:lifecycle-reactivestreams-ktx:${Versions.LIFECYCLE}"

        const val LIFECYCLE_EXTENSIONS =
            "androidx.lifecycle:lifecycle-extensions:2.2.0"
    }

    object NAVIGATION {
        const val RUNTIME =
            "androidx.navigation:navigation-runtime-ktx:${Versions.NAVIGATION}"
        const val FRAGMENT_KTX =
            "androidx.navigation:navigation-fragment-ktx:${Versions.NAVIGATION}"
        const val UI_KTX =
            "androidx.navigation:navigation-ui-ktx:${Versions.NAVIGATION}"
        const val DYNAMIC_FEATURE =
            "androidx.navigation:navigation-dynamic-features-fragment:${Versions.NAVIGATION}"
    }

    object PAGING {
        const val PAGING_RUNTIME =
            "androidx.paging:paging-runtime-ktx:${Versions.PAGING}"

        const val PAGING_RXJAVA2_KTX =
            "androidx.paging:paging-rxjava2-ktx:${Versions.PAGING}"

        const val PAGING_GUAVA = "androidx.paging:paging-guava:${Versions.PAGING}"
    }

    object ROOM {
        const val RUNTIME = "androidx.room:room-runtime:${Versions.ROOM}"
        const val COMPILER = "androidx.room:room-compiler:${Versions.ROOM}"
        const val RXJAVA2 = "androidx.room:room-rxjava2:2.2.5"
        const val KTX = "androidx.room:room-ktx:2.2.5"
    }

    object DATASTORE {
        const val PREFERENCES =
            "androidx.datastore:datastore-preferences:${Versions.DATA_STORE}"
        const val CORE = "androidx.datastore:datastore-core:${Versions.DATA_STORE}"
    }

    object MATERIALDIALOGS {
        const val CORE = "com.afollestad.material-dialogs:core:3.3.0"
        const val INPUT = "com.afollestad.material-dialogs:input:3.3.0"
        const val FILES = "com.afollestad.material-dialogs:files:3.3.0"
        const val BOTTOM_SHEETS = "com.afollestad.material-dialogs:bottomsheets:3.3.0"
        const val LIFECYCLE = "com.afollestad.material-dialogs:lifecycle:3.3.0"
    }

    object INTERCEPTOR {
        const val OK2_CURL = "com.github.mrmike:ok2curl:${Versions.OK2CURL}"
        const val CHUCKER_LIB =
            "com.github.chuckerteam.chucker:library:${Versions.CHUCKER}"
        const val CHUCKER_LIB_NO_OP =
            "com.github.chuckerteam.chucker:library-no-op:${Versions.CHUCKER}"
        const val STETHO = "com.facebook.stetho:stetho:1.5.1"
    }

    object Rx {
        const val ANDROID = "io.reactivex.rxjava3:rxandroid:${Versions.RXANDROID}"
        const val JAVA3 = "io.reactivex.rxjava3:rxjava:${Versions.RXJAVA3}"
    }

    object Retrofit {
        const val RETROFIT = "com.squareup.retrofit2:retrofit:${Versions.RETROFIT}"
        const val RETROFIT_CONVERTER =
            "com.squareup.retrofit2:converter-gson:${Versions.RETROFIT}"
        const val LOGGING =
            "com.squareup.okhttp3:logging-interceptor:${Versions.LOGGING}"
        const val RXJAVA3_ADAPTER =
            "com.squareup.retrofit2:adapter-rxjava3:${Versions.RETROFIT}"
    }

    object Firebase {
        const val PLATFORM = "com.google.firebase:firebase-bom:26.6.0"
        const val ANALYTICS = "com.google.firebase:firebase-analytics-ktx"
        const val CRASHLYTICS  = "com.google.firebase:firebase-crashlytics-ktx"
        const val MESSAGING  = "com.google.firebase:firebase-messaging-ktx"
        const val DYNAMIC_LINK =
            "com.google.firebase:firebase-dynamic-links-ktx"
    }

    object Coroutines {
        const val CORE =
            "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.COROUTINES}"
        const val ANDROID =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.COROUTINES}"
    }
}

/**
 * Debug Dependencies
 */
object DebugDependencies {
    const val LEAKCANARY = "com.squareup.leakcanary:leakcanary-android:${Versions.LEAKCANARY}"
    const val FRAGMENT_TESTING = "androidx.fragment:fragment-testing:${Versions.FRAGMENT_KTX}"
}

/**
 * Dependencies for android test
 */
object TestAndroidDependencies {
    const val LEAKCANARY =
        "com.squareup.leakcanary:leakcanary-android-instrumentation:${Versions.LEAKCANARY}"
    const val ESPRESSO =
        "androidx.test.espresso:espresso-core:${Versions.ESPRESSO}"
    const val RUNNER = "androidx.test:runner:${Versions.TEST}"
    const val RULES = "androidx.test:rules:${Versions.TEST}"
    const val JUNIT = "androidx.test.ext:junit:${Versions.EXT}"
    const val FRAGMENT_TEST =
        "androidx.fragment:fragment-testing:${Versions.FRAGMENT_TEST}"
    const val PLAY_CORE = "com.google.android.play:core:${Versions.PLAY_CORE}"
    const val CORE_TESTING =
        "androidx.arch.core:core-testing:${Versions.ARCH_CORE}"
    const val NAVIGATION_TEST =
        "androidx.navigation:navigation-testing:${Versions.NAVIGATION}"
    const val PAGING_COMMON_TEST =
        "androidx.paging:paging-common-ktx:${Versions.PAGING}"
}

/**
 * Dependencies for unit testing
 */
object TestDependencies {
    const val JUNIT = "junit:junit:${Versions.JUNIT}"
    const val MOCKK = "io.mockk:mockk:${Versions.MOCKK}"
    const val ASSERTJ = "org.assertj:assertj-core:${Versions.ASSERTJ}"
    const val ROBOELECTRIC = "org.robolectric:robolectric:${Versions.ROBOELECTRIC}"
    const val ROOM = "androidx.room:room-testing:${Versions.ROOM}"
    const val EXT = "androidx.test.ext:junit:${Versions.EXT}"
    const val CORE = "androidx.test:core:${Versions.TEST}"
    const val RUNNER = "androidx.test:runner:${Versions.TEST}"
    const val RULES = "androidx.test:rules:${Versions.TEST}"
    const val COROUTINES_TEST = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.COROUTINES}"
    const val ARCH_CORE = "androidx.arch.core:core-testing:${Versions.ARCH_CORE}"
    const val FRAGMENT_TEST = "androidx.fragment:fragment-testing:${Versions.FRAGMENT_TEST}"
    const val MOCK_WEB_SERVER = "com.squareup.okhttp3:mockwebserver:${Versions.MOCK_WEB_SERVER}"
}

/**
 * Dependencies for annotation processor
 */
object AnnotationProcessorsDependencies {
    const val DAGGER = "com.google.dagger:dagger-compiler:${Versions.DAGGER}"
    const val DATABINDING = "com.android.databinding:compiler:${Versions.DATABINDING}"
    const val ROOM = "androidx.room:room-compiler:${Versions.ROOM}"
}