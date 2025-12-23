package com.infinitytransfers.driver.presentation.auth.login


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class LoginViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(LoginUiState())
    val uiState = _uiState.asStateFlow()

    private val _actionFlow = MutableSharedFlow<LoginAction>()
    val actionFlow = _actionFlow.asSharedFlow()

    fun onEvent(event: LoginEvent) {
        when (event) {
            is LoginEvent.OnPhoneNumberChanged -> {
                _uiState.update { it.copy(phoneNumber = event.value) }
            }
            LoginEvent.OnContinueClicked -> {
                // Handle Login Logic here
                viewModelScope.launch {
                    // _actionFlow.emit(LoginAction.Navigate(Dashboard))
                }
            }
            LoginEvent.OnEmailLoginClicked -> {
                // Handle Email Login Logic
            }
            LoginEvent.OnSignUpClicked -> {
                viewModelScope.launch {
//                    _actionFlow.emit(LoginAction.Navigate(Register))
                }
            }
            LoginEvent.OnPrivacyClicked -> { /* Handle Navigation */ }
            LoginEvent.OnSupportClicked -> { /* Handle Navigation */ }
            LoginEvent.OnTermsClicked -> { /* Handle Navigation */ }
            is LoginEvent.OnCountrySelected -> {
                _uiState.update { it.copy(selectedCountry = event.country) }
            }
        }
    }
}