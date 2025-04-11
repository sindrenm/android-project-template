import common.configureCommon

plugins {
  id("com.android.library")
  id("org.jetbrains.kotlin.plugin.compose")
  id("org.jetbrains.kotlin.android")
}

kotlin.configureCommon()
android.configureCommon()

android {
  compileSdk = 36

  defaultConfig {
    minSdk = 26
  }
}
