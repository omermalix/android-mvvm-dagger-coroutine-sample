package com.onebyte.eon.di.module

import com.onebyte.eon.services.networkServices.NetworkService
import com.onebyte.eon.services.repositories.Repository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoriesModule {

    @Provides
    @Singleton
    fun provideRepository(networkService : NetworkService): Repository {
        return Repository(networkService)
    }
}