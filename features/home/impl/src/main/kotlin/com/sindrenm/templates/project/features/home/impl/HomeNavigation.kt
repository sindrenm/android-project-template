package com.sindrenm.templates.project.features.home.impl

import androidx.lifecycle.compose.dropUnlessResumed
import androidx.navigation3.runtime.EntryProviderScope
import com.sindrenm.templates.project.core.navigation.AppNavKey
import com.sindrenm.templates.project.features.home.api.HomeNavKey
import dev.zacsweers.metrox.viewmodel.metroViewModel

fun EntryProviderScope<AppNavKey>.homeScreenEntry() {
  entry<HomeNavKey> {
    val viewModel: HomeViewModel = metroViewModel()

    HomeScreen(
      uiState = viewModel.uiState,
      onProfileClicked = dropUnlessResumed { viewModel.onProfileClicked() },
    )
  }
}
