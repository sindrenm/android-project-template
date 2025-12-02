package com.sindrenm.templates.project

import android.app.Application
import com.sindrenm.templates.project.di.AppGraph
import dev.zacsweers.metro.createGraph
import dev.zacsweers.metrox.android.MetroAppComponentProviders
import dev.zacsweers.metrox.android.MetroApplication

class App : Application(), MetroApplication {
  override val appComponentProviders: MetroAppComponentProviders by lazy { createGraph<AppGraph>() }
}
