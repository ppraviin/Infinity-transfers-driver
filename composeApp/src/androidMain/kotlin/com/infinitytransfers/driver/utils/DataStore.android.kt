package com.infinitytransfers.driver.utils

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.PreferenceDataStoreFactory
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStoreFile

actual class DataStoreProvider(
    private val context: Context
) {
    actual fun provide(): DataStore<Preferences> = PreferenceDataStoreFactory.create(
        produceFile = {
            context.preferencesDataStoreFile(DATASTORE_FILE_NAME)
        }
    )
}