package com.sindrenm.templates.project.features.profile.impl

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sindrenm.templates.project.core.theme.TemplateTheme

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun ProfileScreen(
  uiState: ProfileUiState,
  onUpClicked: () -> Unit,
  onSettingsClicked: () -> Unit,
  modifier: Modifier = Modifier,
) {
  Scaffold(
    modifier = modifier,
    topBar = {
      TopAppBar(
        navigationIcon = {
          IconButton(onClick = onUpClicked) {
            Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Up")
          }
        },
        title = { Text("Profile") },
        actions = {
          IconButton(onClick = onSettingsClicked) {
            Icon(Icons.Default.Settings, contentDescription = "Settings")
          }
        },
      )
    },
  ) { contentPadding ->
    Box(
      modifier = Modifier
        .padding(contentPadding)
        .padding(16.dp),
    ) {
      Text("UI State: $uiState")
    }
  }
}

@Preview
@Composable
private fun ProfileScreenPreview() {
  TemplateTheme {
    ProfileScreen(
      uiState = ProfileUiState,
      onUpClicked = {},
      onSettingsClicked = {},
    )
  }
}
