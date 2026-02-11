package com.sindrenm.templates.project.core.navigation

import dev.zacsweers.metro.Inject

@Inject
class DeepLinkResolver(private val matchers: Set<DeepLinkMatcher>) {
  fun resolveDeepLink(deepLink: String): AppNavKey? {
    return matchers.firstNotNullOfOrNull { it.match(deepLink) }
  }
}
