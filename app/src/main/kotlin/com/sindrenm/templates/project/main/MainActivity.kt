package com.sindrenm.templates.project.main

import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.CompositionLocalProvider
import com.sindrenm.templates.project.core.theme.TemplateTheme
import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.ContributesIntoMap
import dev.zacsweers.metro.Inject
import dev.zacsweers.metro.binding
import dev.zacsweers.metrox.android.ActivityKey
import dev.zacsweers.metrox.viewmodel.LocalMetroViewModelFactory
import dev.zacsweers.metrox.viewmodel.MetroViewModelFactory

@Inject
@ActivityKey(MainActivity::class)
@ContributesIntoMap(AppScope::class, binding<Activity>())
class MainActivity(
  private val metroViewModelFactory: MetroViewModelFactory,
) : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    enableEdgeToEdge()

    super.onCreate(savedInstanceState)

    setContent {
      TemplateTheme {
        CompositionLocalProvider(LocalMetroViewModelFactory provides metroViewModelFactory) {
          MainScreen()
        }
      }
    }
  }
}
