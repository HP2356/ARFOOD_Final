// Set the root project name
rootProject.name = "ARFOOD_Final"

// Plugin management configuration for handling plugin repositories
pluginManagement {
    repositories {
        google {
            content {
                // Include only specific groups in the repository
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()  // Maven Central repository
        gradlePluginPortal()  // Gradle Plugin Portal for plugins
    }
}

// Dependency resolution management for handling project-level repositories
dependencyResolutionManagement {
    repositories {
        google()  // Google's repository
        mavenCentral()  // Maven Central repository

        // Add Unity library's flatDir repository for Unity AARs and JARs
        flatDir {
            dirs(File("C:/Users/patel/AndroidStudioProjects/ARFOOD_Final/unityLibrary/libs"))
        }

        // jcenter (deprecated, but may still be used if required)
        // Removed as it is deprecated, and mavenCentral() is preferred
    }
}

// Include your modules in the root project
include(":app", ":unityLibrary")

// Specify the path for the unityLibrary module if it's located in a custom directory
project(":unityLibrary").projectDir = File("C:/Users/patel/AndroidStudioProjects/ARFOOD_Final/unityLibrary")
