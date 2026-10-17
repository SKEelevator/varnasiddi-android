plugins {
id("com.android.application")
id("org.jetbrains.kotlin.android")
}

android {
namespace = "com.varnasiddi.shop"
compileSdk = 35

defaultConfig {
    applicationId = "com.varnasiddi.shop"
    minSdk = 23
    targetSdk = 35
    versionCode = 1
    versionName = "1.0"
}

buildFeatures {
    compose = true
}

compileOptions {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

kotlinOptions {
    jvmTarget = "17"
}

}

dependencies {
val composeBom = platform("androidx.compose:compose-bom:2025.02.00")

implementation(composeBom)
androidTestImplementation(composeBom)

implementation("androidx.activity:activity-compose:1.10.1")
implementation("androidx.compose.ui:ui")
implementation("androidx.compose.ui:ui-tooling-preview")
implementation("androidx.compose.material3:material3")
implementation("androidx.navigation:navigation-compose:2.8.9")

debugImplementation("androidx.compose.ui:ui-tooling")

}
