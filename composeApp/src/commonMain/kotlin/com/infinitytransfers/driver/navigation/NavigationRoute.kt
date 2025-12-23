package com.infinitytransfers.driver.navigation

import kotlinx.serialization.Serializable

interface NavigationRoute {

}

@Serializable
data object Test: NavigationRoute