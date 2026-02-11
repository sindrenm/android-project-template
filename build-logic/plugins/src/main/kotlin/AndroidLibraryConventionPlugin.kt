import com.android.build.api.dsl.LibraryExtension
import common.configureCommon
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.jetbrains.kotlin.gradle.dsl.KotlinAndroidProjectExtension

class AndroidLibraryConventionPlugin : Plugin<Project> {
  override fun apply(target: Project) {
    with(target) {
      pluginManager.apply("com.android.library")
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
  extensions.configure<LibraryExtension> {
    configureCommon()
  }
}
