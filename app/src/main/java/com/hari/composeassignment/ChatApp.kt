package com.hari.composeassignment

import androidx.compose.runtime.*
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.hari.composeassignment.ui.home.HomeScreen
import com.hari.composeassignment.ui.theme.ChatAppTheme

@Composable
fun ChatApp() {
    var isDark by remember {
        mutableStateOf(false)
    }
    ChatAppTheme(
        darkTheme = isDark
    ) {
        val navController = rememberNavController()

        ChatAppNavGraph(
            navController = navController,
            toggleTheme = { isDark = isDark.not() }
        )
    }

}
