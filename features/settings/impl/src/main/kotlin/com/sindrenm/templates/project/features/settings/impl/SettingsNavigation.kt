package com.sindrenm.templates.project.features.settings.impl

import androidx.lifecycle.compose.dropUnlessResumed
import androidx.navigation3.runtime.EntryProviderScope
import com.sindrenm.templates.project.core.navigation.AppNavKey
import com.sindrenm.templates.project.features.settings.api.SettingsNavKey
import dev.zacsweers.metrox.viewmodel.metroViewModel

fun EntryProviderScope<AppNavKey>.settingsScreenEntry() {
  entry<SettingsNavKey> {
    val viewModel: SettingsViewModel = metroViewModel()

    SettingsScreen(
      uiState = viewModel.uiState,
      onUpClicked = dropUnlessResumed { viewModel.onUpClicked() },
    )
  }
}
