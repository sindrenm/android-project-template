import common.configureCommon
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmProjectExtension

class JvmLibraryConventionPlugin : Plugin<Project> {
  override fun apply(target: Project) {
    with(target) {
      pluginManager.apply("org.jetbrains.kotlin.jvm")

      configureKotlin()
    }
  }

  private fun Project.configureKotlin() {
    extensions.getByType<KotlinJvmProjectExtension>().configureCommon()
  }
}
