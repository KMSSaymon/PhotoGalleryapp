// build.gradle.kts (Top-level)

plugins {
    alias(libs.plugins.android.application) apply false
    // If using Kotlin:
    // alias(libs.plugins.kotlin.android) apply false
}

buildscript {
    dependencies {
        classpath("com.google.gms:google-services:4.4.0") // ✅ Firebase plugin
    }
}
