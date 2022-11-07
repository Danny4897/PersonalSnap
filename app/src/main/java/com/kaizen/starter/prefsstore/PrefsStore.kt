package com.kaizen.starter.prefsstore

import kotlinx.coroutines.flow.Flow

interface PrefsStore {
    fun isNightMode(): Flow<Boolean>

    suspend fun toggleNightMode()
}