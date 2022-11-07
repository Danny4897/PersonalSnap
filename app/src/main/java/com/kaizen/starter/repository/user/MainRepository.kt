package com.kaizen.starter.repository.user

import com.kaizen.starter.network.DataState
import com.kaizen.starter.network.model.DummyResponse
import kotlinx.coroutines.flow.Flow

interface MainRepository {
    suspend fun signInUser(email: String, password: String): Flow<DataState<DummyResponse>>
}
