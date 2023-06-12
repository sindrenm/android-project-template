package com.sindrenm.templates.project.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.sindrenm.templates.project.theme.TemplateTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    enableEdgeToEdge()

    super.onCreate(savedInstanceState)

    setContent {
      TemplateTheme {
        MainScreen()
      }
    }
  }
}
