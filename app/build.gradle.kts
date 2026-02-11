plugins {
  alias(libs.plugins.convention.android.application)
  alias(libs.plugins.kotlin.ksp)
  alias(libs.plugins.metro)
}

android {
  namespace = "com.sindrenm.templates.project"

  defaultConfig {
    applicationId = "com.sindrenm.templates.project"
  }
}

metro {
  @Suppress("OPT_IN_USAGE")
  reportsDestination.set(layout.buildDirectory.dir("reports/metro"))
}

dependencies {
  debugImplementation(platform(libs.androidx.compose.bom))
  implementation(libs.androidx.activity)
  implementation(libs.androidx.activity.compose)
  implementation(libs.androidx.compose.runtime)
  implementation(libs.androidx.core)
  implementation(libs.androidx.navigation3.runtime)
  implementation(libs.androidx.navigation3.ui)
  implementation(libs.metrox.android)
  implementation(libs.metrox.viewmodel.compose)
  implementation(platform(libs.androidx.compose.bom))
  implementation(projects.core.data)
  implementation(projects.core.theme)
  implementation(projects.features.home.api)
  implementation(projects.features.home.impl)
  implementation(projects.features.profile.api)
  implementation(projects.features.profile.impl)
  implementation(projects.features.settings.api)
  implementation(projects.features.settings.impl)
}
