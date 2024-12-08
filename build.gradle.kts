// Top-level build file where you can add configuration options common to all sub-projects/modules.

plugins {
    // Use alias for android application plugin without apply false
    id("com.android.application") version "8.7.0" apply false
}

allprojects {
    repositories {
        // Removed jcenter() as it's now handled in settings.gradle.kts
        // Unity library's flatDir repository is managed in settings.gradle.kts, so it should not be added here.
    }
}
