package com.hari.composeassignment

import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController

object ChatAppDestinations {
    const val HOME_ROUTE = "home"
    const val DETAILS_ROUTE = "details"
}

class ChatAppNavigationActions(navController: NavHostController) {
    val navigateToHome: () -> Unit = {
        navController.navigate(ChatAppDestinations.HOME_ROUTE) {
            popUpTo(navController.graph.findStartDestination().id) {
                saveState = true
            }
            launchSingleTop = true

            restoreState = true
        }
    }

    val navigateToDetails: () -> Unit = {
        navController.navigate(ChatAppDestinations.DETAILS_ROUTE) {
            popUpTo(navController.graph.findStartDestination().id) {
                saveState = true
            }
            launchSingleTop = true

            restoreState = true
        }
    }
}