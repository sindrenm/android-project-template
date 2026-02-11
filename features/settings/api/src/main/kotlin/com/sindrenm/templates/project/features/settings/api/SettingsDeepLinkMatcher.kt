package com.sindrenm.templates.project.features.settings.api

import com.sindrenm.templates.project.core.navigation.AppNavKey
import com.sindrenm.templates.project.core.navigation.DeepLinkMatcher
import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.ContributesIntoSet

@ContributesIntoSet(AppScope::class)
class SettingsDeepLinkMatcher : DeepLinkMatcher {
  private val deepLinkRegex = "template://settings/?".toRegex()

  override fun match(deepLink: String): AppNavKey? {
    return if (deepLink matches deepLinkRegex) SettingsNavKey else null
  }
}
