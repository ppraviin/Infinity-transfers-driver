package com.infinitytransfers.driver

import androidx.compose.ui.window.ComposeUIViewController
import com.infinitytransfers.driver.di.initKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) {
    App()
}