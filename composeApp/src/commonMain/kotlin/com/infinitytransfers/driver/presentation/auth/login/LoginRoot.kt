package com.infinitytransfers.driver.presentation.auth.login

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavHostController
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun LoginRoot(
    navHostController: NavHostController,
    backStackEntry: NavBackStackEntry
) {
    val viewmodel = koinViewModel<LoginViewModel>()

    LaunchedEffect(true) {
        viewmodel.actionFlow.collect { action ->
            when (action) {
                is LoginAction.Navigate -> {
                    navHostController.navigate(action.destination)
                }
            }
        }
    }
    val uiState by viewmodel.uiState.collectAsStateWithLifecycle()

    LoginScreen(
        uiState = uiState,
        onEvent = viewmodel::onEvent
    )
}