package com.infinitytransfers.driver.navigation.auth

import com.infinitytransfers.driver.navigation.NavigationRoute
import kotlinx.serialization.Serializable

sealed class AuthRoutes: NavigationRoute {
    @Serializable
    data object Splash: AuthRoutes()

    @Serializable
    data object Welcome: AuthRoutes()
}