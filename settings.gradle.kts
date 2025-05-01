pluginManagement {
    repositories {
        google() // ✅ Make sure this is at the top
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google() // ✅ Firebase uses this
        mavenCentral()
    }
}

rootProject.name = "PhotoGalleryapp"
include(":app")
