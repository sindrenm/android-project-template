package common

import org.jetbrains.kotlin.gradle.dsl.KotlinProjectExtension

fun KotlinProjectExtension.configureCommon() {
  jvmToolchain(21)
}
