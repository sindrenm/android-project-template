package com.sindrenm.templates.project.features.profile.api

import com.sindrenm.templates.project.core.navigation.AppNavKey
import com.sindrenm.templates.project.core.navigation.DeepLinkMatcher
import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.ContributesIntoSet

@ContributesIntoSet(AppScope::class)
class ProfileDeepLinkMatcher : DeepLinkMatcher {
  private val deepLinkRegex = "template://profile/?".toRegex()

  override fun match(deepLink: String): AppNavKey? {
    return if (deepLink matches deepLinkRegex) ProfileNavKey else null
  }
}
