package com.sindrenm.templates.project.features.home.impl

import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavKey
import com.sindrenm.templates.project.features.home.api.HomeNavKey
import dev.zacsweers.metrox.viewmodel.metroViewModel

fun EntryProviderScope<NavKey>.homeScreenEntry() {
  entry<HomeNavKey> {
    val viewModel: HomeViewModel = metroViewModel()

    HomeScreen(viewModel.uiState)
  }
}
