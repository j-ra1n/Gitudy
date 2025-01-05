package com.takseha.gitudy

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate
import com.takseha.data.api.gitudy.RetrofitInstance

class GitudyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        RetrofitInstance.init(this)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
    }
}