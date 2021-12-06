package com.hari.composeassignment

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class ChatAppTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Before
    fun setUp() {
        composeTestRule.launchChatApp()
    }

    @Test
    fun app_launches() {
        composeTestRule.onNodeWithText("Home Screen").assertExists()
    }
}