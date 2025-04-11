package common

import com.android.build.api.dsl.CommonExtension

private typealias CommonAndroidExtension = CommonExtension<*, *, *, *, *, *>

fun CommonAndroidExtension.configureCommon() {
  compileSdk = 36

  defaultConfig {
    minSdk = 26

    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

    vectorDrawables {
      useSupportLibrary = true
    }
  }

  packaging {
    resources {
      excludes += "/META-INF/{AL2.0,LGPL2.1}"
    }
  }
}
