package com.sindrenm.templates.project.main

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.ui.NavDisplay
import com.sindrenm.templates.project.features.home.impl.homeScreenEntry
import com.sindrenm.templates.project.features.profile.impl.profileScreenEntry
import com.sindrenm.templates.project.features.settings.impl.settingsScreenEntry

@Composable
internal fun MainScreen(
  backStack: NavBackStack<NavKey>,
  modifier: Modifier = Modifier,
) {
  NavDisplay(
    modifier = modifier,
    backStack = backStack,
    entryProvider = entryProvider {
      homeScreenEntry()
      profileScreenEntry()
      settingsScreenEntry()
    },
  )
}
