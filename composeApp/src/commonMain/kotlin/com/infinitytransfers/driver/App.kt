package com.infinitytransfers.driver

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.infinitytransfers.driver.core.theme.AppTheme
import com.infinitytransfers.driver.navigation.MainNavGraph
import com.infinitytransfers.driver.presentation.auth.splash.SplashRoot
import com.infinitytransfers.driver.presentation.auth.splash.SplashScreen
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import infinitytransfersdriver.composeapp.generated.resources.Res
import infinitytransfersdriver.composeapp.generated.resources.compose_multiplatform

@Composable
fun App() {
    val navHostController = rememberNavController()
    AppTheme {
        MainNavGraph(navHostController)
    }
}