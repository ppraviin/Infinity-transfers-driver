package com.infinitytransfers.driver.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.infinitytransfers.driver.navigation.auth.AuthRoutes
import com.infinitytransfers.driver.navigation.auth.authNavGraph

@Composable
fun MainNavGraph(
    navHostController: NavHostController
) {
    NavHost(navController = navHostController, startDestination = AuthRoutes.Splash) {
        authNavGraph(navHostController)
    }
}