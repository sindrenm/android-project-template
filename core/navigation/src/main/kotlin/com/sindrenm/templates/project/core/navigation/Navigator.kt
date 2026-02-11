package com.sindrenm.templates.project.core.navigation

import androidx.compose.runtime.snapshots.SnapshotStateList

class Navigator(private val backStack: SnapshotStateList<AppNavKey>) {
  fun navigateTo(key: AppNavKey) {
    backStack.add(key)
  }

  fun popBackStack() {
    backStack.removeLastOrNull()
  }
}
