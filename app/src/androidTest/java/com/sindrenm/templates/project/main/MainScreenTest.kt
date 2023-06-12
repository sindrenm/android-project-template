package com.sindrenm.templates.project.main

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import org.junit.Rule
import org.junit.Test

class MainScreenTest {
  @get:Rule
  val composeTestRule = createComposeRule()

  @Test
  fun screenTitleIsVisible() {
    composeTestRule.setContent {
      MainScreen()
    }

    composeTestRule.onNodeWithText("Android Template").assertExists()
  }
}
