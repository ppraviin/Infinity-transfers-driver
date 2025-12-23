package com.infinitytransfers.driver.utils

import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class AppPreference(
    private val dataStoreProvider: DataStoreProvider
) {

    private val dataStore = dataStoreProvider.provide()

    /* ---------- GENERIC HELPERS ---------- */

    private fun <T> get(
        key: Preferences.Key<T>,
        default: T
    ): Flow<T> =
        dataStore.data.map { it[key] ?: default }

    private fun <T> getNullable(
        key: Preferences.Key<T>
    ): Flow<T?> =
        dataStore.data.map { it[key] }

    private suspend fun <T> set(
        key: Preferences.Key<T>,
        value: T
    ) {
        dataStore.edit { it[key] = value }
    }

    private suspend fun <T> remove(
        key: Preferences.Key<T>
    ) {
        dataStore.edit { it.remove(key) }
    }


    companion object {
        val BASEURL = stringPreferencesKey("base_url")
        val ACCESS_TOKEN = stringPreferencesKey("access_token")
    }


    // base url
    val baseUrl: Flow<String?> = getNullable(BASEURL)
    val accessToken: Flow<String?> = getNullable(ACCESS_TOKEN)

    suspend fun setBaseUrl(value: String) {
        set(BASEURL, value)
    }

    suspend fun setAccessToken(value: String) {
        set(ACCESS_TOKEN, value)
    }



}


/*
class PreferenceDelegate<T>(
    private val dataStore: DataStore<Preferences>,
    private val key: Preferences.Key<T>,
    private val default: T
) {
    val flow: Flow<T> =
        dataStore.data.map { it[key] ?: default }

    suspend fun set(value: T) {
        dataStore.edit { it[key] = value }
    }
}
*/

//--------- will Use in Future in case wanted ----------
// Another level of Achievement
//val baseUrlX = PreferenceDelegate(dataStore, BASEURL, "")