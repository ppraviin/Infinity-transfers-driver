package com.infinitytransfers.driver.core.theme

import androidx.compose.material3.lightColorScheme

internal val LightTheme = lightColorScheme(
    primary = AppColors.yellow,
    onPrimary = AppColors.black,

    secondary = AppColors.darkBg,
    onSecondary = AppColors.white,

    background = AppColors.white,
    onBackground = AppColors.black,

    surface = AppColors.greyCard,
    onSurface = AppColors.descriptionText,

    surfaceVariant = AppColors.descriptionText,
    onSurfaceVariant = AppColors.white,

    error = AppColors.error,
    onError = AppColors.white
)
