package com.onebyte.eon.utils

import android.content.SharedPreferences

class PrefManager {

    companion object {
        /**
         * Save date in preferences
         */
        fun savePreferences(key: String, value: String, sp: SharedPreferences) {
            val edit = sp.edit()
            edit.putString(key, value)
            edit.apply()
        }

        /**
         * Save boolean date in preferences
         */
        fun saveBooleanPreferences(key: String, value: Boolean, sp: SharedPreferences) {
            val edit = sp.edit()
            edit.putBoolean(key, value)
            edit.apply()
        }

        /**
         * Load date in preferences
         */
        fun loadPreferences(sp: SharedPreferences, Key: String): String? {
            return sp.getString(Key, "0")

        }

        /**
         * Load boolean date in preferences
         */
        fun loadBooleanPreferences(sp: SharedPreferences, Key: String): Boolean {
            return sp.getBoolean(Key, false)

        }

        /**
         * Remove specific date from preferences
         */
        fun removePrefrence(sp: SharedPreferences, key: String) {
            val editor = sp.edit()
            editor.remove(key)
            editor.apply()
        }
    }

}