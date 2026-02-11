package com.sindrenm.templates.project.main

import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.sindrenm.templates.project.features.home.api.HomeNavKey
import com.sindrenm.templates.project.features.home.impl.homeScreenEntry

@Composable
internal fun MainScreen() {
  val backStack = rememberNavBackStack(HomeNavKey)

  NavDisplay(
    backStack = backStack,
    entryProvider = entryProvider {
      homeScreenEntry()
    },
  )
}
