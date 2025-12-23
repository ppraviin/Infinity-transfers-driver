package com.infinitytransfers.driver.di

import com.infinitytransfers.driver.utils.AppPreference
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val appModules = module {
    singleOf(::AppPreference)

}