package com.sindrenm.templates.project.core.navigation

import androidx.navigation3.runtime.NavKey

interface AppNavKey : NavKey {
  val parent: AppNavKey?
    get() = null
}
