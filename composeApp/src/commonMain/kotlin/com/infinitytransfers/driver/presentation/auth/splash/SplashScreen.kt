package com.infinitytransfers.driver.presentation.auth.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import infinitytransfersdriver.composeapp.generated.resources.Res
import infinitytransfersdriver.composeapp.generated.resources.icon
import org.jetbrains.compose.resources.painterResource

@Composable
fun SplashScreen(
    uiState: SplashUiState,
    onEvent: (SplashEvent) -> Unit
) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        Column(horizontalAlignment = Alignment.CenterHorizontally) {

            Image(painter = painterResource(
                Res.drawable.icon
            ),
                contentDescription = null
            )
            Text(text = "Infinity Transfer Driver")
            CircularProgressIndicator()
        }
    }
}