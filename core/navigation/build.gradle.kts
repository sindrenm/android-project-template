plugins {
  alias(libs.plugins.convention.android.library)
  alias(libs.plugins.kotlin.serialization)
}

android {
  namespace = "com.sindrenm.templates.project.core.navigation"
}

dependencies {
  implementation(libs.androidx.navigation3.runtime)
  implementation(libs.androidx.navigation3.ui)
  implementation(libs.kotlinx.serialization.core)
}
