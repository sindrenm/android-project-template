package common

import org.jetbrains.kotlin.gradle.dsl.HasConfigurableKotlinCompilerOptions
import org.jetbrains.kotlin.gradle.dsl.KotlinAndroidProjectExtension
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmCompilerOptions
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmProjectExtension

internal fun KotlinAndroidProjectExtension.configureCommon() {
  jvmToolchain(21)
  setWarningsAsErrors()
}

internal fun KotlinJvmProjectExtension.configureCommon() {
  jvmToolchain(21)
  setWarningsAsErrors()
}

private fun HasConfigurableKotlinCompilerOptions<KotlinJvmCompilerOptions>.setWarningsAsErrors() {
  compilerOptions.allWarningsAsErrors.set(true)
}
