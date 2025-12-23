package com.infinitytransfers.driver.presentation.auth.splash

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class SplashViewModel: ViewModel() {
    private val _uiState = MutableStateFlow(SplashUiState())
    val uiState = _uiState.asStateFlow()
    private val _actionFlow = MutableSharedFlow<SplashAction>()
    val actionFlow = _actionFlow.asSharedFlow()

    fun onEvent(event: SplashEvent) {
        when(event) {
            SplashEvent.Refresh -> {

            }
        }
    }

    init {
        viewModelScope.launch {
            delay(3000)
            _actionFlow.emit(SplashAction.NavigateToLogin)
        }
    }

}

