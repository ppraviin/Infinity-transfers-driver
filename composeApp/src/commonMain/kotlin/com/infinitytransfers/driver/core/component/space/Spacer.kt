package com.infinitytransfers.driver.core.component.space

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp


object Spacing {
    val extraSmall: Dp = 4.dp
    val small: Dp = 8.dp
    val smallMedium: Dp = 12.dp
    val medium: Dp = 16.dp
    val mediumLarge: Dp = 20.dp
    val large: Dp = 24.dp
    val extraLarge: Dp = 32.dp
    val extraLargeSmall: Dp = 40.dp
    val extraExtraLarge: Dp = 48.dp
    val topBarHeight: Dp = 96.dp
}

object AppDimension {
    val spacing = Spacing
}


// ------------------
//region  Horizontal Spacers
// ------------------

@Composable
fun ExtraSmallHorizontalSpacer(modifier: Modifier = Modifier) {
    Spacer(modifier = modifier.width(AppDimension.spacing.extraSmall))
}

@Composable
fun SmallHorizontalSpacer(modifier: Modifier = Modifier) {
    Spacer(modifier = modifier.width(AppDimension.spacing.small))
}

@Composable
fun MediumHorizontalSpacer(modifier: Modifier = Modifier) {
    Spacer(modifier = modifier.width(AppDimension.spacing.medium))
}

@Composable
fun LargeHorizontalSpacer(modifier: Modifier = Modifier) {
    Spacer(modifier = modifier.width(AppDimension.spacing.large))
}

@Composable
fun ExtraLargeHorizontalSpacer(modifier: Modifier = Modifier) {
    Spacer(modifier = modifier.width(AppDimension.spacing.extraLarge))
}

//endregion

// ----------------
//region Vertical Spacers
// ----------------

@Composable
fun ExtraSmallVerticalSpacer(modifier: Modifier = Modifier) {
    Spacer(modifier = modifier.height(AppDimension.spacing.extraSmall))
}

@Composable
fun SmallVerticalSpacer(modifier: Modifier = Modifier) {
    Spacer(modifier = modifier.height(AppDimension.spacing.small))
}

@Composable
fun MediumVerticalSpacer(modifier: Modifier = Modifier) {
    Spacer(modifier = modifier.height(AppDimension.spacing.medium))
}

@Composable
fun LargeVerticalSpacer(modifier: Modifier = Modifier) {
    Spacer(modifier = modifier.height(AppDimension.spacing.large))
}

@Composable
fun ExtraLargeVerticalSpacer(modifier: Modifier = Modifier) {
    Spacer(modifier = modifier.height(AppDimension.spacing.extraLarge))
}

//endregion