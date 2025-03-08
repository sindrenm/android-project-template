@file:Suppress("UnstableApiUsage")

pluginManagement {
  repositories {
    gradlePluginPortal()
  }
}

dependencyResolutionManagement {
  repositories {
    google()
    gradlePluginPortal()
    mavenCentral()
  }

  versionCatalogs {
    create("libs") {
      from(files("../gradle/libs.versions.toml"))
    }
  }
}

rootProject.name = "build-logic"

include(":plugins")
