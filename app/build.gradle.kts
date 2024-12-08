plugins {
    // Using the alias for the Android application plugin
    alias(libs.plugins.android.application)
}

android {
    // Namespace for the application module
    namespace = "com.codewithhetang.arfood_final"

    // SDK versions
    compileSdk = 34
    defaultConfig {
        applicationId = "com.codewithhetang.arfood_final" // App ID
        minSdk = 24 // Minimum SDK Version
        targetSdk = 34 // Target SDK Version
        versionCode = 1 // Version Code
        versionName = "1.0" // Version Name

        // Test runner for instrumentation tests
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    // Build types (release)
    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    // Java compatibility
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    // Packaging options to enable legacy packaging for native libraries
    packagingOptions {
        jniLibs.useLegacyPackaging = true  // Enable legacy packaging for native libraries
    }
}

dependencies {
    // Android libraries
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(files("C:\\Users\\patel\\AndroidStudioProjects\\ARFOOD_Final\\app\\src\\main\\libs\\VuforiaEngine-9.7.0.aar"))
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    // Unity integration - Linking to the Unity module/library
    implementation(project(":unityLibrary"))

    // Additional dependencies for the app (if any)
    // Example:
    // implementation 'com.google.ar:core:1.36.0'  // AR Core, if needed
    // implementation 'com.google.android.material:material:1.5.0'  // Example Material Design library
}
