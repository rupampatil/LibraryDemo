package com.example.mylibrary

import android.R
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.annotation.RestrictTo
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import androidx.fragment.app.FragmentManager


@RestrictTo(RestrictTo.Scope.LIBRARY)
class DemoLibraryClass {

    fun popSimpleToast(context: Context, msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }

    fun OpenActivity(context: Context) {
        val intent = Intent(context, com.example.mylibrary.MainActivity1::class.java)
        startActivity(context, intent, Bundle())
    }

    fun OpenFragment(activity: AppCompatActivity) {

        val k =
            if (activity.supportFragmentManager.findFragmentById(android.R.id.content) == null) {
                activity.supportFragmentManager.beginTransaction()
                    .add(android.R.id.content, BlankFragment())
                    .addToBackStack(null)
                    .commit()
            } else {
                null
            }
    }
}