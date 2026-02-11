package com.sindrenm.templates.project.features.home.impl

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.sindrenm.templates.project.features.profile.api.ProfileNavKey
import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.ContributesIntoMap
import dev.zacsweers.metro.Inject
import dev.zacsweers.metrox.viewmodel.ViewModelKey

@Inject
@ViewModelKey(HomeViewModel::class)
@ContributesIntoMap(AppScope::class)
class HomeViewModel(
  private val navBackStack: NavBackStack<NavKey>,
) : ViewModel() {
  var uiState: HomeUiState by mutableStateOf(HomeUiState)
    private set

  fun onProfileClicked() {
    navBackStack.add(ProfileNavKey)
  }
}
