package com.sindrenm.templates.project.features.profile.impl

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.sindrenm.templates.project.core.navigation.Navigator
import com.sindrenm.templates.project.features.settings.api.SettingsNavKey
import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.ContributesIntoMap
import dev.zacsweers.metro.Inject
import dev.zacsweers.metrox.viewmodel.ViewModelKey

@Inject
@ViewModelKey(ProfileViewModel::class)
@ContributesIntoMap(AppScope::class)
class ProfileViewModel(
  private val navigator: Navigator,
) : ViewModel() {
  var uiState: ProfileUiState by mutableStateOf(ProfileUiState)
    private set

  fun onUpClicked() {
    navigator.navigateUp()
  }

  fun onSettingsClicked() {
    navigator.navigateTo(SettingsNavKey)
  }
}
