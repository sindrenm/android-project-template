package com.sindrenm.templates.project.core.navigation

interface DeepLinkMatcher {
  fun match(deepLink: String): AppNavKey?
}
