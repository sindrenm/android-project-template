plugins {
  alias(libs.plugins.convention.android.library)
  alias(libs.plugins.metro)
}

android {
  namespace = "com.sindrenm.templates.project.features.profile.impl"
}

dependencies {
  debugImplementation(libs.androidx.compose.ui.tooling)
  debugImplementation(platform(libs.androidx.compose.bom))
  implementation(libs.androidx.compose.foundation)
  implementation(libs.androidx.compose.material3)
  implementation(libs.androidx.compose.runtime)
  implementation(libs.androidx.compose.ui)
  implementation(libs.androidx.compose.ui.tooling.preview)
  implementation(libs.androidx.navigation3.runtime)
  implementation(libs.metrox.viewmodel.compose)
  implementation(platform(libs.androidx.compose.bom))
  implementation(projects.core.theme)
  implementation(projects.features.profile.api)
}
