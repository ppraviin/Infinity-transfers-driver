package com.infinitytransfers.driver.di

import com.infinitytransfers.driver.presentation.auth.splash.SplashViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val viewModuleModules = module {
    viewModelOf(::SplashViewModel)
    viewModelOf(::SplashViewModel)
}