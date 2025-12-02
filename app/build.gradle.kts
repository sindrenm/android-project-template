plugins {
  alias(libs.plugins.convention.android.application)
  alias(libs.plugins.kotlin.ksp)
}

android {
  namespace = "com.sindrenm.templates.project"

  defaultConfig {
    applicationId = "com.sindrenm.templates.project"
  }

  compileOptions {
    isCoreLibraryDesugaringEnabled = true
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
  implementation(libs.androidx.lifecycle.viewModel)
  implementation(libs.androidx.lifecycle.viewModel.compose)
  implementation(libs.androidx.navigation.compose)
  implementation(libs.androidx.navigation3.runtime)
  implementation(libs.androidx.navigation3.ui)
  implementation(libs.arrow.core)
  implementation(libs.arrow.optics)
  implementation(libs.coil.compose)
  implementation(libs.kotlinx.coroutines.core)
  implementation(platform(libs.androidx.compose.bom))
  implementation(projects.core.data)
  implementation(projects.core.navigation)
  implementation(projects.core.theme)
  ksp(libs.arrow.optics.ksp)
  testImplementation(libs.kotlin.test)
}
