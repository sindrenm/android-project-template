package common

import com.android.build.api.dsl.CommonExtension

internal fun CommonExtension.configureCommon() {
  compileSdk = 36

  defaultConfig.apply {
    minSdk = 28

    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

    vectorDrawables {
      useSupportLibrary = true
    }
  }

  packaging.apply {
    resources {
      excludes += "/META-INF/{AL2.0,LGPL2.1}"
    }
  }
}
