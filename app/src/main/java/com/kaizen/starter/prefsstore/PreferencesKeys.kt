package com.kaizen.starter.prefsstore

import androidx.datastore.preferences.core.booleanPreferencesKey

object PreferencesKeys {
    val NIGHT_MODE_KEY = booleanPreferencesKey("dark_theme_enabled")
}