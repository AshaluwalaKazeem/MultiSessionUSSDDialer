/*
 * Copyright (c) 2020. BoostTag E.I.R.L. Romell D.Z.
 * All rights reserved
 * porfile.romellfudi.com
 */

package com.romellfudi.ussd.di

import android.content.Context
import com.romellfudi.ussdlibrary.USSDApi
import com.romellfudi.ussdlibrary.USSDController
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * @autor Romell Domínguez
 * @date 2020-04-21
 * @version 1.0
 */
@Module
class USSDModule {

    @Provides // drop abstract
    @Singleton
    fun provideUSSDApi(context: Context): USSDApi {
        return USSDController.getInstance(context)
    }
//    @Binds
//    abstract fun provideApi(api: USSDController): USSDApi
}