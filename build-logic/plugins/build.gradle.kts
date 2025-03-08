plugins {
  `kotlin-dsl`
}

group = "com.sindrenm.templates.project.build.plugins"

dependencies {
  implementation(pluginCoordinates(libs.plugins.android.application))
  implementation(pluginCoordinates(libs.plugins.android.library))
  implementation(pluginCoordinates(libs.plugins.kotlin.android))
  implementation(pluginCoordinates(libs.plugins.kotlin.compose))

  // https://github.com/gradle/gradle/issues/15383#issuecomment-779893192
  implementation(files(libs.javaClass.superclass.protectionDomain.codeSource.location))
}

private fun pluginCoordinates(pluginDependency: Provider<PluginDependency>): Provider<String> =
  pluginDependency.map {
    val id = it.pluginId
    val version = it.version

    "$id:$id.gradle.plugin:$version"
  }
