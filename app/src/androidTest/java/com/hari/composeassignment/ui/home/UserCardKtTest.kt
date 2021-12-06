package com.hari.composeassignment.ui.home

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithText
import com.hari.composeassignment.R
import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class UserCardKtTest {

    @get:Rule
    val composeTestRule = createComposeRule()


    @Test
    fun user_card_test() {
        composeTestRule.setContent {
            UserCard(
                firstLine = "Hari Singh Kulhari",
                secondLine = "Android Developer",
                iconRes = R.drawable.ic_theme
            )
        }
        composeTestRule.onNodeWithText("Hari Singh Kulhari").assertExists()
    }

    @Test
    fun user_card_test_with_first_line() {
        composeTestRule.setContent {
            UserCard(
                firstLine = "Hari Singh Kulhari"
            )
        }
        composeTestRule.onNodeWithContentDescription("icon").assertDoesNotExist()
    }
}