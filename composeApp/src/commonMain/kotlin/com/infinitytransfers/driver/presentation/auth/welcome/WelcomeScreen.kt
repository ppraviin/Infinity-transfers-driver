package com.infinitytransfers.driver.presentation.auth.welcome

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.infinitytransfers.driver.utils.AppLogger

@Composable
fun WelcomeScreen() {
    Text("Welcome to the page")
    AppLogger.d("PARASH", "Welcome Screen Logging Setup Check ")
}