package com.onebyte.eon.di.module

import com.onebyte.eon.utils.CustomPopups
import dagger.Module
import dagger.Provides

@Module
class CustomPopupModule {

    @Provides
    fun provideCustomPopups(): CustomPopups {
        return CustomPopups()
    }
}