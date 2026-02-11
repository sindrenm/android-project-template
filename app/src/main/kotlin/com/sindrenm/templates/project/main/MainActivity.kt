package com.sindrenm.templates.project.main

import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.snapshots.SnapshotStateList
import com.sindrenm.templates.project.core.navigation.AppNavKey
import com.sindrenm.templates.project.core.navigation.Navigator
import com.sindrenm.templates.project.core.theme.TemplateTheme
import com.sindrenm.templates.project.features.home.api.HomeNavKey
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
  private val navigator: Navigator,
  private val backStack: SnapshotStateList<AppNavKey>,
) : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    enableEdgeToEdge()

    super.onCreate(savedInstanceState)

    intent.dataString?.let { navigator.populateFromDeepLink(it, startNavKey = HomeNavKey) }

    setContent {
      TemplateTheme {
        CompositionLocalProvider(LocalMetroViewModelFactory provides metroViewModelFactory) {
          MainScreen(backStack)
        }
      }
    }
  }
}
