package dev.lizarraga.onesignalandroid

import android.app.Application
import com.onesignal.OneSignal

class OneSignalApplication: Application() {
    val ONESIGNAL_APP_ID = "Tu-OneSignal-ID-aqui"

    override fun onCreate() {
        super.onCreate()
        // Logging set to help debug issues, remove before releasing your app.
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        // OneSignal Initialization
        OneSignal.initWithContext(this)
        OneSignal.setAppId(ONESIGNAL_APP_ID)
    }
}