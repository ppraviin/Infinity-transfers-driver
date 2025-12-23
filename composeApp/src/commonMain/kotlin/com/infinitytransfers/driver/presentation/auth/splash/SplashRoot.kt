package com.infinitytransfers.driver.presentation.auth.splash

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun SplashRoot() {
    val viewModel = viewModel<SplashViewModel>()
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    LaunchedEffect(true) {
        viewModel.actionFlow.collect { splashAction ->
            when(splashAction) {
                SplashAction.NavigateToWelcome -> {

                }
            }
        }
    }

    SplashScreen(uiState, onEvent = viewModel::onEvent)
}