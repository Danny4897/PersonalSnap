package com.kaizen.starter.di

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.kaizen.starter.network.model.DummyDtoMapper
import com.kaizen.starter.network.services.DummyService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    fun provideOkHttpClient(): OkHttpClient {
        val builder = OkHttpClient.Builder()
        builder.connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .addInterceptor { chain ->
                val newRequest = chain.request().newBuilder()
                    .addHeader("api-key", "123456")
                    .build()
                chain.proceed(newRequest)
            }
        return builder.build()
    }


    @Singleton
    @Provides
    fun provideDummyMapper(): DummyDtoMapper {
        return DummyDtoMapper()
    }

    @Singleton
    @Provides
    fun provideGsonBuilder(): Gson {
        return GsonBuilder()
            .create()
    }

    @Singleton
    @Provides
    fun provideRetrofit(gson: Gson, okHttpClient: OkHttpClient): Retrofit.Builder {
        return Retrofit.Builder()
            .baseUrl("https://www.google.com")
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create(gson))
    }

    @Singleton
    @Provides
    fun provideService(retrofit: Retrofit.Builder): DummyService {
        return retrofit
            .build()
            .create(DummyService::class.java)
    }
}