package com.sindrenm.templates.project.di

import androidx.navigation3.runtime.NavBackStack
import com.sindrenm.templates.project.core.navigation.AppNavKey
import com.sindrenm.templates.project.features.home.api.HomeNavKey
import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.DependencyGraph
import dev.zacsweers.metro.Provides
import dev.zacsweers.metro.SingleIn
import dev.zacsweers.metrox.android.MetroAppComponentProviders
import dev.zacsweers.metrox.viewmodel.ViewModelGraph

@DependencyGraph(AppScope::class)
interface AppGraph : MetroAppComponentProviders, ViewModelGraph {
  @Provides
  @SingleIn(AppScope::class)
  fun provideNavBackStack(): NavBackStack<AppNavKey> {
    return NavBackStack(HomeNavKey)
  }
}
