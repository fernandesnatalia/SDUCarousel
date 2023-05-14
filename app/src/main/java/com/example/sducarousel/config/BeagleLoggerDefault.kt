package com.example.sducarousel.config

import android.util.Log
import br.com.zup.beagle.android.annotation.BeagleComponent
import br.com.zup.beagle.android.logger.BeagleLogger

const val TAG = "LOG ->>>>>>>> BEAGLE"

@BeagleComponent
class BeagleLoggerDefault : BeagleLogger {
    override fun error(message: String) {
        Log.e(TAG, message)
    }

    override fun error(message: String, throwable: Throwable) {
        Log.e(TAG, message,throwable)
    }

    override fun info(message: String) {
        Log.i(TAG, message)
    }

    override fun warning(message: String) {
        Log.w(TAG, message)
    }
}