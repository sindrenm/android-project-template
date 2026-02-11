package com.sindrenm.templates.project.features.profile.impl

import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavKey
import com.sindrenm.templates.project.features.profile.api.ProfileNavKey
import dev.zacsweers.metrox.viewmodel.metroViewModel

fun EntryProviderScope<NavKey>.profileScreenEntry() {
  entry<ProfileNavKey> {
    val viewModel: ProfileViewModel = metroViewModel()

    ProfileScreen(viewModel.uiState)
  }
}
