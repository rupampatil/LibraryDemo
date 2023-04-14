package com.example.mylibrary

import android.content.Context
import androidx.appcompat.app.AppCompatActivity

interface IToast {
    fun simpleToast(context:Context,msg:String)
    fun startActivity(context: Context)
    fun startFragment(activity: AppCompatActivity)
}