package com.infinitytransfers.driver.presentation.auth.splash

data class  SplashUiState(
    val isLoading: Boolean = false,
    val error: String? = null
)

sealed class SplashEvent {
    data object Refresh: SplashEvent()
}

sealed class SplashAction {
    data object NavigateToWelcome: SplashAction()
}

