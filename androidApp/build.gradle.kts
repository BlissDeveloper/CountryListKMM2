plugins {
    id("com.android.application")
    kotlin("android")
    // kotlin("multiplatform").version("1.8.0").apply(false)
}

android {
    namespace = "com.pulsar.countrieslistmulti.android"
    compileSdk = 32
    defaultConfig {
        applicationId = "com.pulsar.countrieslistmulti.android"
        minSdk = 28
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.3.0"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}

dependencies {
    val koin = "3.2.0"
    implementation(project(":shared"))
    implementation("androidx.compose.ui:ui:1.2.1")
    implementation("androidx.compose.ui:ui-tooling:1.2.1")
    implementation("androidx.compose.ui:ui-tooling-preview:1.2.1")
    implementation("androidx.compose.foundation:foundation:1.2.1")
    implementation("androidx.compose.material:material:1.2.1")
    implementation("androidx.activity:activity-compose:1.5.1")

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4")
    implementation("io.insert-koin:koin-android:$3.2.0")
    implementation("io.insert-koin:koin-androidx-compose:$koin")

    implementation("io.coil-kt:coil-compose:2.2.2")
}