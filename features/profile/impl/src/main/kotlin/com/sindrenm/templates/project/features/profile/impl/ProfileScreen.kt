package com.sindrenm.templates.project.features.profile.impl

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
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
fun ProfileScreen(uiState: ProfileUiState, modifier: Modifier = Modifier) {
  Scaffold(
    modifier = modifier,
    topBar = { TopAppBar(title = { Text("Profile") }) },
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
    )
  }
}
