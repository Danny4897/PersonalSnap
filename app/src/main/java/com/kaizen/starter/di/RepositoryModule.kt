package com.kaizen.starter.di

import com.kaizen.starter.network.services.DummyService
import com.kaizen.starter.repository.user.MainRepository
import com.kaizen.starter.repository.user.MainRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideUserRepository(dummyService: DummyService): MainRepository {
        return MainRepositoryImpl(dummyService)
    }


}