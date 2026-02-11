plugins {
  alias(libs.plugins.convention.jvm.library)
  alias(libs.plugins.kotlin.serialization)
}

dependencies {
  api(projects.core.navigation)
  implementation(libs.androidx.navigation3.runtime)
  implementation(libs.kotlinx.serialization.core)
}
