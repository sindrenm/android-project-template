package com.sindrenm.templates.project.features.home.api

import com.sindrenm.templates.project.core.navigation.AppNavKey
import com.sindrenm.templates.project.core.navigation.DeepLinkMatcher
import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.ContributesIntoSet

@ContributesIntoSet(AppScope::class)
class HomeDeepLinkMatcher : DeepLinkMatcher {
  private val deepLinkRegex = "template://home/?".toRegex()

  override fun match(deepLink: String): AppNavKey? {
    return if (deepLink matches deepLinkRegex) HomeNavKey else null
  }
}
