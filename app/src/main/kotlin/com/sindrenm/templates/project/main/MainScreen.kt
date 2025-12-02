package com.sindrenm.templates.project.main

import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.sindrenm.templates.project.core.navigation.NavKeys
import com.sindrenm.templates.project.features.home.HomeScreen
import com.sindrenm.templates.project.features.home.HomeViewModel
import dev.zacsweers.metrox.viewmodel.metroViewModel

@Composable
internal fun MainScreen() {
  val backStack = rememberNavBackStack(NavKeys.Home)

  NavDisplay(
    backStack = backStack,
    entryProvider = entryProvider {
      entry<NavKeys.Home> {
        val viewModel: HomeViewModel = metroViewModel()

        HomeScreen(viewModel.uiState)
      }
    },
  )
}
