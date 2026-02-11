plugins {
  alias(libs.plugins.convention.jvm.library)
  alias(libs.plugins.kotlin.serialization)
}

dependencies {
  api(projects.core.navigation)
  api(projects.features.profile.api)
  implementation(libs.androidx.navigation3.runtime)
  implementation(libs.kotlinx.serialization.core)
}
