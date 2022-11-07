package com.kaizen.starter.repository.user

import com.kaizen.starter.network.DataState
import com.kaizen.starter.network.model.DummyResponse
import com.kaizen.starter.network.services.DummyService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf


class MainRepositoryImpl(
    private val dummyService: DummyService
) : MainRepository {


    override suspend fun signInUser(
        email: String,
        password: String
    ): Flow<DataState<DummyResponse>> {
        return flowOf(dummyService.getAll())
    }


}




