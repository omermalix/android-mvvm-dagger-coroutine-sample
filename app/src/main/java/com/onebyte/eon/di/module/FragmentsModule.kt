package com.onebyte.eon.di.module

import com.onebyte.eon.di.module.fragmentModule.HomeFragmentModule
import com.onebyte.eon.ui.home.fragments.HomeFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentsModule {

    @ContributesAndroidInjector(modules = [HomeFragmentModule::class])
    internal abstract fun contributeHomeFragment(): HomeFragment
}