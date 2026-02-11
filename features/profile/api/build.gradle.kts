plugins {
  alias(libs.plugins.convention.jvm.library)
  alias(libs.plugins.kotlin.serialization)
}

dependencies {
  implementation(libs.androidx.navigation3.runtime)
  implementation(libs.kotlinx.serialization.core)
}
