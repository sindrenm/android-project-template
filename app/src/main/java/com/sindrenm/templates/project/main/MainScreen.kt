package com.sindrenm.templates.project.main

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
@OptIn(ExperimentalMaterial3Api::class)
internal fun MainScreen() {
  Scaffold(
    topBar = { TopAppBar(title = { Text("Android Template") }) },
  ) { contentPadding ->
    Box(Modifier.padding(contentPadding))
  }
}
