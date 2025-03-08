plugins {
  id("com.android.library")
  id("org.jetbrains.kotlin.plugin.compose")
  id("org.jetbrains.kotlin.android")
}

kotlin {
  jvmToolchain(21)
}

android {
  compileSdk = 35

  defaultConfig {
    minSdk = 26
  }
}
