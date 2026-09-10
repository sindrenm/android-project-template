package common

import com.android.build.api.dsl.CommonExtension

internal fun CommonExtension.configureCommon() {
  compileSdk {
    version = release(37) {
      minorApiLevel = 2
    }
  }

  defaultConfig.apply {
    minSdk {
      version = release(28)
    }

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
