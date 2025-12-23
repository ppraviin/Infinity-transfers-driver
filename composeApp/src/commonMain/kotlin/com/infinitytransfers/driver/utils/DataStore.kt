@file:Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")

package com.infinitytransfers.driver.utils

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences

expect class DataStoreProvider {
    fun provide(): DataStore<Preferences>
}

const val DATASTORE_FILE_NAME = "itdriver.preferences_pb"