package com.infinitytransfers.driver.core.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun AppTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = LightTheme,
        typography = appTypography()
    ) {
        content()
    }

}
