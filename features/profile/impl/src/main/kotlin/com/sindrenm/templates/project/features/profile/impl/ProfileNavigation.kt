package com.sindrenm.templates.project.features.profile.impl

import androidx.lifecycle.compose.dropUnlessResumed
import androidx.navigation3.runtime.EntryProviderScope
import com.sindrenm.templates.project.core.navigation.AppNavKey
import com.sindrenm.templates.project.features.profile.api.ProfileNavKey
import dev.zacsweers.metrox.viewmodel.metroViewModel

fun EntryProviderScope<AppNavKey>.profileScreenEntry() {
  entry<ProfileNavKey> {
    val viewModel: ProfileViewModel = metroViewModel()

    ProfileScreen(
      uiState = viewModel.uiState,
      onUpClicked = dropUnlessResumed { viewModel.onUpClicked() },
      onSettingsClicked = dropUnlessResumed { viewModel.onSettingsClicked() },
    )
  }
}
