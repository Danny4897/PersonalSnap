package com.kaizen.starter.network.services

import com.kaizen.starter.network.DataState
import com.kaizen.starter.network.model.DummyResponse
import retrofit2.http.GET

interface DummyService {
    @GET("dummy")
    suspend fun getAll(): DataState<DummyResponse>
}