package com.sindrenm.templates.project.features.settings.api

import com.sindrenm.templates.project.core.navigation.AppNavKey
import com.sindrenm.templates.project.features.profile.api.ProfileNavKey
import kotlinx.serialization.Serializable

@Serializable
object SettingsNavKey : AppNavKey {
  override val parent: AppNavKey = ProfileNavKey
}

