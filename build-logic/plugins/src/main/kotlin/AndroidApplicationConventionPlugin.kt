import com.android.build.api.dsl.ApplicationExtension
import common.configureCommon
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.jetbrains.kotlin.gradle.dsl.KotlinAndroidProjectExtension

class AndroidApplicationConventionPlugin : Plugin<Project> {
  override fun apply(target: Project) {
    with(target) {
      pluginManager.apply("com.android.application")
      pluginManager.apply("org.jetbrains.kotlin.plugin.compose")

      configureKotlin()
      configureAndroid()
    }
  }
}

private fun Project.configureKotlin() {
  extensions.configure<KotlinAndroidProjectExtension>() {
    configureCommon()
  }
}

private fun Project.configureAndroid() {
  extensions.configure<ApplicationExtension> {
    configureCommon()

    defaultConfig {
      targetSdk = 36

      versionCode = 1
      versionName = "0.1.0"
    }

    buildTypes {
      release {
        isMinifyEnabled = false

        proguardFiles(
          getDefaultProguardFile("proguard-android-optimize.txt"),
          "proguard-rules.pro",
        )
      }
    }
  }
}
