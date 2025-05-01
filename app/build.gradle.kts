plugins {
    alias(libs.plugins.android.application)
    id("com.google.gms.google-services") // ✅ Firebase plugin
}

android {
    namespace = "com.example.photogalleryapp"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.photogalleryapp"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)

    // ✅ Firebase Authentication
    implementation("com.google.firebase:firebase-auth:23.2.0")

    // ✅ Firebase Firestore (if you're using Firestore)
    implementation("com.google.firebase:firebase-firestore:25.1.3")

    // ✅ Firebase Core (essential for Firebase SDK to work)
    implementation("com.google.firebase:firebase-core:21.1.1")

    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}
