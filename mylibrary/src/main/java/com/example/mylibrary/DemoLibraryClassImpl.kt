package com.example.mylibrary

import android.content.Context
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DemoLibraryClassImpl:IToast {
    override fun simpleToast(context: Context, msg: String) {
        DemoLibraryClass().popSimpleToast(context,msg)
    }

    override fun startActivity(context: Context) {
        DemoLibraryClass().OpenActivity(context)
    }

    override fun startFragment(activity:AppCompatActivity) {
       DemoLibraryClass().OpenFragment(activity)
    }
}