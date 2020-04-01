package com.onebyte.eon.di.module.fragmentModule

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import dagger.Module
import dagger.Provides

@Module
class HomeFragmentModule {
    @Provides
    fun provideAddedAnimalLayoutManager(context: Context): LinearLayoutManager{
        return LinearLayoutManager(context)
    }
}