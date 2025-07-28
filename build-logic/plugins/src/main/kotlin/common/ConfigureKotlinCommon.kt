package common

import org.jetbrains.kotlin.gradle.dsl.KotlinProjectExtension

internal fun KotlinProjectExtension.configureCommon() {
  jvmToolchain(21)
}
