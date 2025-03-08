@file:Suppress("UnstableApiUsage")

import org.gradle.api.initialization.resolve.RepositoriesMode.FAIL_ON_PROJECT_REPOS

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
  repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
  }

  includeBuild("build-logic")
}

dependencyResolutionManagement {
  repositoriesMode.set(FAIL_ON_PROJECT_REPOS)

  repositories {
    google()
    mavenCentral()
  }
}

rootProject.name = "Template"

include(":app")
include(":core:theme")
