package com.infinitytransfers.driver

import android.app.Application
import com.infinitytransfers.driver.di.initKoin
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger

class BaseApp: Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@BaseApp)
            androidLogger()
        }
    }
}