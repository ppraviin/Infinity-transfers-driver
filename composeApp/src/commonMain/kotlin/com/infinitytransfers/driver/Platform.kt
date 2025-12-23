package com.infinitytransfers.driver

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform