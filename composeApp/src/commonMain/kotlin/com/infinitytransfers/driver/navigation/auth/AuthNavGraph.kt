package com.infinitytransfers.driver.navigation.auth

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.infinitytransfers.driver.presentation.auth.splash.SplashRoot
import com.infinitytransfers.driver.presentation.auth.welcome.WelcomeScreen

fun NavGraphBuilder.authNavGraph(navHostController: NavHostController) {
    composable<AuthRoutes.Splash> {
        SplashRoot(navHostController, it)
    }

    composable<AuthRoutes.Welcome> {
        WelcomeScreen()
    }
}