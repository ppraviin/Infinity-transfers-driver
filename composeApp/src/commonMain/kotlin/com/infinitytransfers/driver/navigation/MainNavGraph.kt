package com.infinitytransfers.driver.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.infinitytransfers.driver.navigation.auth.AuthRoutes
import com.infinitytransfers.driver.navigation.auth.authNavGraph
import com.infinitytransfers.driver.presentation.auth.login.LoginScreen

@Composable
fun MainNavGraph(
    navHostController: NavHostController
) {
    NavHost(
        navController = navHostController,
        startDestination = AuthRoutes.Splash,
//        startDestination = Test
    ) {
        authNavGraph(navHostController)


        composable<Test> { }
    }
}