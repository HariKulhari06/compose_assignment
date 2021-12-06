package com.hari.composeassignment

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.hari.composeassignment.ui.details.DetailsScreen
import com.hari.composeassignment.ui.home.HomeScreen

@Composable
fun ChatAppNavGraph(
    navController: NavHostController = rememberNavController(),
    startDestination: String = ChatAppDestinations.HOME_ROUTE,
    toggleTheme:()->Unit,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        modifier = modifier,
        startDestination = startDestination
    ) {
        composable(ChatAppDestinations.HOME_ROUTE) {
            HomeScreen(toggleTheme)
        }
        composable(ChatAppDestinations.DETAILS_ROUTE) {
            DetailsScreen()
        }
    }
}