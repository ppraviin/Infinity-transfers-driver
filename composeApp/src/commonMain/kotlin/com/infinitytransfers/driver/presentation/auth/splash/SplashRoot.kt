package com.infinitytransfers.driver.presentation.auth.splash

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavHostController
import com.infinitytransfers.driver.navigation.auth.AuthRoutes

@Composable
fun SplashRoot(
    navHostController: NavHostController,
    backStackEntry: NavBackStackEntry
) {
    val viewModel = viewModel<SplashViewModel>()
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    LaunchedEffect(true) {
        viewModel.actionFlow.collect { splashAction ->
            when(splashAction) {
                SplashAction.NavigateToWelcome -> {
                    navHostController.navigate(AuthRoutes.Welcome)
                }

                SplashAction.NavigateToHome -> TODO()
            }
        }
    }

    SplashScreen(uiState, onEvent = viewModel::onEvent)
}