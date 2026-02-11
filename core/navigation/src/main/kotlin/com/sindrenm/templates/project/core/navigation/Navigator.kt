package com.sindrenm.templates.project.core.navigation

import androidx.compose.runtime.mutableStateListOf
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
  private var syntheticBackStack: SnapshotStateList<AppNavKey>? = null

  fun populateFromDeepLink(deepLink: String, startNavKey: AppNavKey) {
    val resolvedNavKey = deepLinkResolver.resolveDeepLink(deepLink) ?: return

    Snapshot.withMutableSnapshot {
      syntheticBackStack = buildSyntheticBackStack(resolvedNavKey, startNavKey)

      backStack.clear()
      backStack.add(resolvedNavKey)
    }
  }

  fun navigateTo(key: AppNavKey) {
    backStack.add(key)
  }

  fun navigateUp() {
    val synthetic = syntheticBackStack

    if (synthetic == null) {
      backStack.removeLastOrNull()
    } else {
      Snapshot.withMutableSnapshot {
        backStack.clear()
        backStack.addAll(synthetic.dropLast(1))
        syntheticBackStack = null
      }
    }
  }
}

private fun buildSyntheticBackStack(target: AppNavKey, startNavKey: AppNavKey): SnapshotStateList<AppNavKey> {
  val backStack = mutableStateListOf<AppNavKey>()
  var current: AppNavKey? = target

  while (current != null) {
    backStack.add(0, current)
    current = current.parent
  }

  backStack.add(0, startNavKey)

  return backStack
}
