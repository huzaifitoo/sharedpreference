package com.example.sharedpreferences

import android.content.Context
import android.preference.PreferenceManager

object SharedPrefHelper {

    fun saveEmail(context: Context, email: String) {
        PreferenceManager.getDefaultSharedPreferences(
            context
        )
            .edit()
            .putString("EMAIL", email)
            .apply()
    }

    fun savePassword(context: Context, password: String){
        PreferenceManager.getDefaultSharedPreferences(
            context
        )
            .edit()
            .putString("PASSWORD", password)
            .apply()
    }

    fun saveDob(context: Context, dob: String) {
        PreferenceManager.getDefaultSharedPreferences(context)
            .edit()
            .putString("DOB", dob)
            .apply()
    }


    fun getEmail(context: Context): String? {
        return PreferenceManager.getDefaultSharedPreferences(
            context
        ).getString("EMAIL", "")
    }

    fun getPassword(context: Context): String? {
        return PreferenceManager.getDefaultSharedPreferences(
            context
        ).getString("PASSWORD", "")
    }

    fun getDob(context: Context): String? {
        return PreferenceManager.getDefaultSharedPreferences(context)
            .getString("DOB", "")
    }

    fun clearEmail(context: Context) {
        PreferenceManager.getDefaultSharedPreferences(context)
            .edit()
            .remove("EMAIL").apply()
    }

    fun clearDob(context: Context) {
        PreferenceManager.getDefaultSharedPreferences(context)
            .edit()
            .remove("DOB").apply()
    }

    fun clearPassword(context: Context) {
        PreferenceManager.getDefaultSharedPreferences(context)
            .edit()
            .remove("PASSWORD").apply()
    }

}