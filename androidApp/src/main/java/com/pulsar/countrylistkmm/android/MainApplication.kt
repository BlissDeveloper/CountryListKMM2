package com.pulsar.countrieslistmulti.android

import android.app.Application
import com.pulsar.countrylistkmm.android.di.androidModule
import com.pulsar.countrylistkmm.di.initKoin
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger



class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@MainApplication)
            androidLogger()
            modules(androidModule())
        }
    }
}