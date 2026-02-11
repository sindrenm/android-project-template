package com.sindrenm.templates.project.features.settings.impl

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.navigation3.runtime.NavBackStack
import com.sindrenm.templates.project.core.navigation.AppNavKey
import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.ContributesIntoMap
import dev.zacsweers.metro.Inject
import dev.zacsweers.metrox.viewmodel.ViewModelKey

@Inject
@ViewModelKey(SettingsViewModel::class)
@ContributesIntoMap(AppScope::class)
class SettingsViewModel(
  private val navBackStack: NavBackStack<AppNavKey>,
) : ViewModel() {
  var uiState: SettingsUiState by mutableStateOf(SettingsUiState)
    private set

  fun onUpClicked() {
    navBackStack.removeLastOrNull()
  }
}
