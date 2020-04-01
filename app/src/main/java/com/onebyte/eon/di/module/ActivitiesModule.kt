package com.onebyte.eon.di.module

import com.onebyte.eon.di.module.activitiesModule.HomeActivityModule
import com.onebyte.eon.ui.home.HomeActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivitiesModule {

    @ContributesAndroidInjector(modules = [HomeActivityModule::class])
    internal abstract fun contributeHomeActivity(): HomeActivity
}