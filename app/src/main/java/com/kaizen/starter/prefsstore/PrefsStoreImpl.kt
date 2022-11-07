package com.kaizen.starter.prefsstore

import android.content.Context
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class PrefsStoreImpl @Inject constructor(@ApplicationContext val context: Context) : PrefsStore {
    companion object {
        private val Context.dataStore by preferencesDataStore(STORE_NAME)
    }

    override fun isNightMode() =
        context.dataStore.data.map { it[PreferencesKeys.NIGHT_MODE_KEY] ?: false }


    override suspend fun toggleNightMode() {
        context.dataStore.edit {
            it[PreferencesKeys.NIGHT_MODE_KEY] = !(it[PreferencesKeys.NIGHT_MODE_KEY] ?: false)
        }
    }


}


private const val STORE_NAME = "app_key_store"

