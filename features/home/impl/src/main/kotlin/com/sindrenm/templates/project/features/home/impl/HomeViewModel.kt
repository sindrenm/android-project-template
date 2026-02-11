package com.sindrenm.templates.project.features.home.impl

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.sindrenm.templates.project.core.navigation.Navigator
import com.sindrenm.templates.project.features.profile.api.ProfileNavKey
import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.ContributesIntoMap
import dev.zacsweers.metro.Inject
import dev.zacsweers.metrox.viewmodel.ViewModelKey

@Inject
@ViewModelKey(HomeViewModel::class)
@ContributesIntoMap(AppScope::class)
class HomeViewModel(
  private val navigator: Navigator,
) : ViewModel() {
  var uiState: HomeUiState by mutableStateOf(HomeUiState)
    private set

  fun onProfileClicked() {
    navigator.navigateTo(ProfileNavKey)
  }
}
