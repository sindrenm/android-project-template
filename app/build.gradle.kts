plugins {
  alias(libs.plugins.android.application)
  alias(libs.plugins.dagger.hilt.android)
  alias(libs.plugins.kotlin.compose)
  alias(libs.plugins.kotlin.android)
  alias(libs.plugins.kotlin.ksp)
}

kotlin {
  jvmToolchain(21)
}

android {
  namespace = "com.sindrenm.templates.project"
  compileSdk = 35

  defaultConfig {
    applicationId = "com.sindrenm.templates.project"

    minSdk = 26
    targetSdk = 35

    versionCode = 1
    versionName = "0.1.0"

    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

    vectorDrawables {
      useSupportLibrary = true
    }
  }

  buildTypes {
    release {
      isMinifyEnabled = false

      proguardFiles(
        getDefaultProguardFile("proguard-android-optimize.txt"),
        "proguard-rules.pro",
      )
    }
  }

  compileOptions {
    isCoreLibraryDesugaringEnabled = true
  }

  packaging {
    resources {
      excludes += "/META-INF/{AL2.0,LGPL2.1}"
    }
  }
}

dependencies {
  coreLibraryDesugaring(libs.android.desugarJdkLibs)
  debugImplementation(libs.androidx.compose.ui.test.manifest)
  debugImplementation(libs.androidx.compose.ui.tooling)
  debugImplementation(platform(libs.androidx.compose.bom))
  implementation(libs.androidx.activity)
  implementation(libs.androidx.activity.compose)
  implementation(libs.androidx.compose.animation)
  implementation(libs.androidx.compose.foundation)
  implementation(libs.androidx.compose.material.icons)
  implementation(libs.androidx.compose.material.icons.extended)
  implementation(libs.androidx.compose.material3)
  implementation(libs.androidx.compose.runtime)
  implementation(libs.androidx.compose.ui)
  implementation(libs.androidx.compose.ui.tooling.preview)
  implementation(libs.androidx.core)
  implementation(libs.androidx.hilt.navigation.compose)
  implementation(libs.androidx.lifecycle.viewModel)
  implementation(libs.androidx.lifecycle.viewModel.compose)
  implementation(libs.androidx.navigation.compose)
  implementation(libs.arrow.core)
  implementation(libs.arrow.optics)
  implementation(libs.coil.compose)
  implementation(libs.dagger.auto.android)
  implementation(libs.dagger.hilt.runtime)
  implementation(libs.google.material)
  implementation(libs.kotlinx.coroutines.core)
  implementation(platform(libs.androidx.compose.bom))
  ksp(libs.androidx.hilt.compiler)
  ksp(libs.arrow.optics.ksp)
  ksp(libs.dagger.auto.compiler)
  ksp(libs.dagger.hilt.compiler)
  testImplementation(libs.kotlin.test)
}
