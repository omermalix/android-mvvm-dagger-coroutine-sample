package com.onebyte.eon.di.assistedFactory

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import com.squareup.inject.assisted.Assisted
import com.squareup.inject.assisted.AssistedInject

class AssistedInjectionFactory @AssistedInject constructor(@Assisted context: Context): LinearLayoutManager(context){

    @AssistedInject.Factory
    interface Factory{
        fun create(context: Context): AssistedInjectionFactory
    }
}