package com.infinitytransfers.driver.presentation.auth.login

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.infinitytransfers.driver.core.component.space.AppDimension
import com.infinitytransfers.driver.core.component.space.LargeVerticalSpacer
import com.infinitytransfers.driver.core.component.space.MediumVerticalSpacer
import com.infinitytransfers.driver.core.component.space.SmallHorizontalSpacer
import com.infinitytransfers.driver.core.component.space.SmallVerticalSpacer
import com.infinitytransfers.driver.core.theme.AppTheme
import com.stevdza_san.library.component.CountryPickerDialog
import infinitytransfersdriver.composeapp.generated.resources.Res
import infinitytransfersdriver.composeapp.generated.resources.compose_multiplatform
import infinitytransfersdriver.composeapp.generated.resources.ic_mail
import infinitytransfersdriver.composeapp.generated.resources.ic_next
import infinitytransfersdriver.composeapp.generated.resources.icon
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview


@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    uiState: LoginUiState,
    onEvent: (LoginEvent) -> Unit
) {

    var showCountryPicker by remember { mutableStateOf(false) }


    AnimatedVisibility(showCountryPicker) {
        CountryPickerDialog(
            selectedCountry = uiState.selectedCountry,
            onConfirmClick = { country ->
                onEvent(LoginEvent.OnCountrySelected(country))
                showCountryPicker = false
            },
            onDismiss = {
                showCountryPicker = false
            }
        )
    }



    Scaffold(
        modifier = modifier.fillMaxSize()
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .padding(horizontal = AppDimension.spacing.medium)
        ) {
            MediumVerticalSpacer()
            Image(
                painter = painterResource(Res.drawable.icon),
                contentDescription = "Icon",
                modifier = Modifier.size(50.dp)
            )
            MediumVerticalSpacer()
            Text(
                "Welcome Driver",
                style = MaterialTheme.typography.headlineSmall.copy(
                    fontWeight = FontWeight.Bold
                )
            )
            SmallVerticalSpacer()

            Text(
                "Please enter your registered phone number to access your dashboard and pickups",
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.surfaceVariant
            )
            LargeVerticalSpacer()

            Text(
                "PHONE NUMBER", style = MaterialTheme.typography.titleSmall.copy(
                    fontWeight = FontWeight.SemiBold
                )
            )
            OutlinedTextField(
                value = uiState.phoneNumber,
                onValueChange = { onEvent(LoginEvent.OnPhoneNumberChanged(it)) },
                modifier = Modifier.fillMaxWidth(),
                placeholder = {
                    Text(
                        "Mobile Number",
                        style = MaterialTheme.typography.bodyMedium.copy(
                            color = MaterialTheme.colorScheme.surfaceVariant,
                            fontWeight = FontWeight.SemiBold
                        )
                    )
                },
                leadingIcon = {
                    Image(
                        painter = painterResource(uiState.selectedCountry.flag),
                        contentDescription = "",
                        modifier = Modifier.size(32.dp).clickable {
                            showCountryPicker = true
                        }
                    )
                },
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedContainerColor = MaterialTheme.colorScheme.surface,
                    focusedContainerColor = MaterialTheme.colorScheme.surface,
                )
            )

            LargeVerticalSpacer()

            Button(
                onClick = { onEvent(LoginEvent.OnContinueClicked) },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(20)
            ) {
                Text(
                    "Continue", style = MaterialTheme.typography.bodyMedium.copy(
                        fontWeight = FontWeight.SemiBold
                    ),
                    modifier = Modifier.padding(vertical = AppDimension.spacing.small)
                )
                SmallHorizontalSpacer()
                Icon(
                    painter = painterResource(Res.drawable.ic_next),
                    contentDescription = ""
                )
            }
            LargeVerticalSpacer()

            Text(
                "OR LOGIN WITH",
                style = MaterialTheme.typography.bodyMedium.copy(
                    fontWeight = FontWeight.SemiBold,
                    color = MaterialTheme.colorScheme.surfaceVariant,
                    textAlign = TextAlign.Center
                ),
                modifier = Modifier.fillMaxWidth()
            )

            LargeVerticalSpacer()

            Button(
                onClick = { onEvent(LoginEvent.OnEmailLoginClicked) },
                shape = RoundedCornerShape(20),
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.onBackground,
                    contentColor = MaterialTheme.colorScheme.onSurfaceVariant
                )
            ) {
                Icon(
                    painter = painterResource(Res.drawable.ic_mail),
                    contentDescription = "email"
                )
                SmallHorizontalSpacer()
                Text(
                    "Login With Email",
                    style = MaterialTheme.typography.bodyMedium.copy(
                        fontWeight = FontWeight.SemiBold
                    ),
                    modifier = Modifier.padding(vertical = AppDimension.spacing.small)
                )
            }

            Spacer(modifier = Modifier.weight(1f))

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    "Don't have an account?",
                    style = MaterialTheme.typography.bodyMedium.copy(
                        fontWeight = FontWeight.SemiBold,
                        color = MaterialTheme.colorScheme.surfaceVariant
                    )
                )
                TextButton(onClick = { onEvent(LoginEvent.OnSignUpClicked) }) {
                    Text(
                        "Sign Up",
                        color = MaterialTheme.colorScheme.onBackground,
                        style = MaterialTheme.typography.bodyMedium.copy(
                            fontWeight = FontWeight.Bold
                        )
                    )
                }
            }

            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                TextButton(onClick = { onEvent(LoginEvent.OnPrivacyClicked) }) {
                    Text(
                        "PRIVACY",
                        style = MaterialTheme.typography.labelMedium.copy(
                            fontWeight = FontWeight.SemiBold,
                            color = MaterialTheme.colorScheme.surfaceVariant
                        )
                    )
                }
                VerticalDivider(Modifier.height(20.dp))
                TextButton(onClick = { onEvent(LoginEvent.OnTermsClicked) }) {
                    Text(
                        "TERMS",
                        style = MaterialTheme.typography.labelMedium.copy(
                            fontWeight = FontWeight.SemiBold,
                            color = MaterialTheme.colorScheme.surfaceVariant
                        )
                    )
                }
                VerticalDivider(Modifier.height(20.dp))
                TextButton(onClick = { onEvent(LoginEvent.OnSupportClicked) }) {
                    Text(
                        "SUPPORT",
                        style = MaterialTheme.typography.labelMedium.copy(
                            fontWeight = FontWeight.SemiBold,
                            color = MaterialTheme.colorScheme.surfaceVariant
                        )
                    )
                }
            }
            LargeVerticalSpacer()
        }
    }
}


@Preview
@Composable
fun LoginScreenPreview() {
    AppTheme {
        LoginScreen(
            uiState = LoginUiState(),
            onEvent = {}
        )
    }

}