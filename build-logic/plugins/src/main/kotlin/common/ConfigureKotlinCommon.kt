package common

import org.jetbrains.kotlin.gradle.dsl.KotlinAndroidProjectExtension
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmProjectExtension

internal fun KotlinAndroidProjectExtension.configureCommon() {
  jvmToolchain(21)

  compilerOptions.allWarningsAsErrors.set(true)
}

internal fun KotlinJvmProjectExtension.configureCommon() {
  jvmToolchain(21)

  compilerOptions.allWarningsAsErrors.set(true)
}
