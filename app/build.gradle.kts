plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.jamil.college"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.jamil.college"
        minSdk = 24
        targetSdk = 34
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    buildFeatures{
        viewBinding = true
    }

}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)

    //Card View & Recycler View
    implementation(libs.cardview)
    implementation(libs.recyclerview)

    //REST API Implementation
    implementation(libs.retrofit)
    implementation(libs.converter.gson)
    implementation(libs.converter.scalars)
    implementation(libs.logging.interceptor)
    implementation(libs.adapter.rxjava2)

    //Lottie Animation
    implementation(libs.lottie)
    //GSON
    implementation(libs.gson)
    //Image Display from URL
    implementation(libs.glide)
    annotationProcessor(libs.compiler)

    //Circular Image View
    implementation(libs.circleimageview)

    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}