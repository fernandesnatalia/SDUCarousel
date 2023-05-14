package com.example.sducarousel.config

import android.app.Application
import com.example.sducarousel.BeagleSetup

class AppApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        APPLICATION = this
        BeagleSetup().init(this)
    }

    companion object {
        var APPLICATION: Application? = null
    }
}