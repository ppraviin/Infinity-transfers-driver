package com.infinitytransfers.driver.core.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import infinitytransfersdriver.composeapp.generated.resources.AvenirNext_Bold
import infinitytransfersdriver.composeapp.generated.resources.AvenirNext_DemiBold
import infinitytransfersdriver.composeapp.generated.resources.AvenirNext_Medium
import infinitytransfersdriver.composeapp.generated.resources.AvenirNext_Regular
import infinitytransfersdriver.composeapp.generated.resources.AvenirNext_UltraLight
import infinitytransfersdriver.composeapp.generated.resources.Res
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.Font


@OptIn(ExperimentalResourceApi::class)
@Composable
fun avenirNextFontFamily() = FontFamily(
    Font(Res.font.AvenirNext_UltraLight, weight = FontWeight.Light),
    Font(Res.font.AvenirNext_Regular, weight = FontWeight.Normal),
    Font(Res.font.AvenirNext_Medium, weight = FontWeight.Medium),
    Font(Res.font.AvenirNext_DemiBold, weight = FontWeight.SemiBold),
    Font(Res.font.AvenirNext_Bold, weight = FontWeight.Bold)
)

@Composable
fun appTypography() = Typography().run {

    val fontFamily = avenirNextFontFamily()
    copy(
        displayLarge = displayLarge.copy(fontFamily = fontFamily),
        displayMedium = displayMedium.copy(fontFamily = fontFamily),
        displaySmall = displaySmall.copy(fontFamily = fontFamily),
        headlineLarge = headlineLarge.copy(fontFamily = fontFamily),
        headlineMedium = headlineMedium.copy(fontFamily = fontFamily),
        headlineSmall = headlineSmall.copy(fontFamily = fontFamily),
        titleLarge = titleLarge.copy(fontFamily = fontFamily),
        titleMedium = titleMedium.copy(fontFamily = fontFamily),
        titleSmall = titleSmall.copy(fontFamily = fontFamily),
        bodyLarge = bodyLarge.copy(fontFamily =  fontFamily),
        bodyMedium = bodyMedium.copy(fontFamily = fontFamily),
        bodySmall = bodySmall.copy(fontFamily = fontFamily),
        labelLarge = labelLarge.copy(fontFamily = fontFamily),
        labelMedium = labelMedium.copy(fontFamily = fontFamily),
        labelSmall = labelSmall.copy(fontFamily = fontFamily)
    )
}
