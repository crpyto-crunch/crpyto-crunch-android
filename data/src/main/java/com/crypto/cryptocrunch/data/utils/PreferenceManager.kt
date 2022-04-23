package com.crypto.cryptocrunch.data.utils

import android.content.Context
import android.content.SharedPreferences

class PreferenceManager(context: Context) {
    private val infoSkipPref: SharedPreferences =
        context.getSharedPreferences(Crypto_APP, Context.MODE_PRIVATE)

    var infoSkip: Boolean
        get() = infoSkipPref.getBoolean(INFO_SKIP_KEY, false)
        set(value) {
            val editor = infoSkipPref.edit()
            editor.putBoolean(INFO_SKIP_KEY, value)
            editor.apply()
        }

    companion object {
        private const val Crypto_APP = "Crypto_APP"
        const val INFO_SKIP_KEY = "AUTO_LOGIN_KEY"
    }
}