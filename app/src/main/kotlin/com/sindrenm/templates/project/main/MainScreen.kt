package com.sindrenm.templates.project.main

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.sindrenm.templates.project.core.navigation.NavKeys

@Composable
internal fun MainScreen() {
  val backStack = rememberNavBackStack(NavKeys.Home)

  NavDisplay(
    backStack = backStack,
    entryProvider = entryProvider {
      entry<NavKeys.Home> {
        HomeScreen()
      }
    },
  )
}

@Composable
@OptIn(ExperimentalMaterial3Api::class)
private fun HomeScreen() {
  Scaffold(
    topBar = { TopAppBar(title = { Text("Android Template") }) },
  ) { contentPadding ->
    Box(Modifier.padding(contentPadding))
  }
}
