plugins {
    alias(libs.plugins.android.library)
}

android {
    namespace = "com.heavywater.cityweather.feature.currentweather.api"
}

dependencies {
    api(project(":core:navigation"))
}