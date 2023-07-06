@file:Suppress("UnstableApiUsage")

import com.android.build.api.dsl.ManagedVirtualDevice

plugins {
  alias(libs.plugins.android.application)
  alias(libs.plugins.dagger.hilt.android)
  alias(libs.plugins.kotlin.android)
  alias(libs.plugins.kotlin.kapt)
  alias(libs.plugins.kotlin.ksp)
  alias(libs.plugins.kotlinter)
}

android {
  namespace = "com.sindrenm.templates.project"
  compileSdk = 34

  defaultConfig {
    applicationId = "com.sindrenm.templates.project"

    minSdk = 24
    targetSdk = 34

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
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17

    isCoreLibraryDesugaringEnabled = true
  }

  kotlinOptions {
    jvmTarget = "17"
  }

  buildFeatures {
    compose = true
  }

  composeOptions {
    kotlinCompilerExtensionVersion = libs.versions.androidx.compose.compiler.get()
  }

  packaging {
    resources {
      excludes += "/META-INF/{AL2.0,LGPL2.1}"
    }
  }

  testOptions {
    managedDevices {
      devices {
        maybeCreate<ManagedVirtualDevice>("pixel7Api33").apply {
          device = "Pixel 7"
          apiLevel = 33
          systemImageSource = "google"
        }
      }
    }
  }
}

dependencies {
  androidTestImplementation(libs.androidx.compose.ui.test.junit4)
  androidTestImplementation(platform(libs.androidx.compose.bom))

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

  kapt(libs.androidx.compose.compiler)
  kapt(libs.androidx.hilt.compiler)
  kapt(libs.dagger.auto.compiler)
  kapt(libs.dagger.hilt.compiler)

  ksp(libs.arrow.optics.ksp)

  testImplementation(libs.kotlin.test)
}
