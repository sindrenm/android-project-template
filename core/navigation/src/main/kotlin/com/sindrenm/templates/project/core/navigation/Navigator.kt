package com.sindrenm.templates.project.core.navigation

import androidx.compose.runtime.snapshots.Snapshot
import androidx.compose.runtime.snapshots.SnapshotStateList
import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.Inject
import dev.zacsweers.metro.SingleIn

@Inject
@SingleIn(AppScope::class)
class Navigator(
  private val backStack: SnapshotStateList<AppNavKey>,
  private val deepLinkResolver: DeepLinkResolver,
) {
  fun populateFromDeepLink(deepLink: String, startNavKey: AppNavKey) {
    val resolvedNavKey = deepLinkResolver.resolveDeepLink(deepLink) ?: return

    Snapshot.withMutableSnapshot {
      backStack.clear()
      var target: AppNavKey? = resolvedNavKey

      while (target != null) {
        backStack.add(0, target)
        target = target.parent
      }

      backStack.add(0, startNavKey)
    }
  }

  fun navigateTo(key: AppNavKey) {
    backStack.add(key)
  }

  fun popBackStack() {
    backStack.removeLastOrNull()
  }
}
