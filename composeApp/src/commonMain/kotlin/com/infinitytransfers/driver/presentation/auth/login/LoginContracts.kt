package com.infinitytransfers.driver.presentation.auth.login

import com.infinitytransfers.driver.navigation.NavigationRoute
import com.stevdza_san.library.domain.Country


data class LoginUiState(
    val isLoading: Boolean = false,
    val phoneNumber: String = "",
    val selectedCountry: Country = Country.Nepal,
    val showCountryPicker: Boolean = false,
)

sealed class LoginEvent {
    data class OnPhoneNumberChanged(val value: String) : LoginEvent()
    object OnContinueClicked : LoginEvent()
    object OnEmailLoginClicked : LoginEvent()
    object OnSignUpClicked : LoginEvent()

    // Auxiliary events for the footer links
    object OnPrivacyClicked : LoginEvent()
    object OnTermsClicked : LoginEvent()
    object OnSupportClicked : LoginEvent()
    data class OnCountrySelected(val country: Country) : LoginEvent()
}

sealed class LoginAction {
    data class Navigate(val destination: NavigationRoute) : LoginAction()
}