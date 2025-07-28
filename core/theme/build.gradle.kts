plugins {
  alias(libs.plugins.convention.android.library)
}

android {
  namespace = "com.sindrenm.templates.project.core.theme"
}

dependencies {
  debugImplementation(libs.androidx.compose.ui.tooling)
  debugImplementation(platform(libs.androidx.compose.bom))
  implementation(libs.androidx.compose.animation)
  implementation(libs.androidx.compose.foundation)
  implementation(libs.androidx.compose.material.icons)
  implementation(libs.androidx.compose.material.icons.extended)
  implementation(libs.androidx.compose.material3)
  implementation(libs.androidx.compose.runtime)
  implementation(libs.androidx.compose.ui)
  implementation(libs.androidx.compose.ui.tooling.preview)
  implementation(libs.google.material)
  implementation(platform(libs.androidx.compose.bom))
}
