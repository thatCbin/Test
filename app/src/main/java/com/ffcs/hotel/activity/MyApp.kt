package com.ffcs.hotel.activity

import android.app.Application
import android.content.Context
import androidx.multidex.MultiDex

/**
 * @author Cbin
 * @CreateDate 2024/2/19
 * @describe
 */
class MyApp : Application() {
    private var instance: MyApp? = null
    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(base)
    }
}