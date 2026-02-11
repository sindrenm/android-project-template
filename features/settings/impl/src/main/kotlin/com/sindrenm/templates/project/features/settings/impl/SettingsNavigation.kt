package com.sindrenm.templates.project.features.settings.impl

import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavKey
import com.sindrenm.templates.project.features.settings.api.SettingsNavKey
import dev.zacsweers.metrox.viewmodel.metroViewModel

fun EntryProviderScope<NavKey>.settingsScreenEntry() {
  entry<SettingsNavKey> {
    val viewModel: SettingsViewModel = metroViewModel()

    SettingsScreen(viewModel.uiState)
  }
}
