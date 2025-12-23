package com.infinitytransfers.driver.di

import com.infinitytransfers.driver.utils.DataStoreProvider
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

actual val platformModules: Module
    get() = module {
        singleOf(::DataStoreProvider)
    }