package com.onebyte.eon.di.module.activitiesModule

import com.onebyte.eon.ui.home.HomeActivity
import com.onebyte.eon.ui.home.fragments.*
import com.onebyte.eon.utils.ProgressHUD
import dagger.Module
import dagger.Provides

@Module
class HomeActivityModule {

    @Provides
    fun provideLoader(homeActivity: HomeActivity): ProgressHUD {
        return ProgressHUD(homeActivity)
    }

    @Provides
    fun provideHomeFragment(): HomeFragment {
        return HomeFragment()
    }

}