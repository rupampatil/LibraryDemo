package com.example.librarydemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mylibrary.DemoLibraryClassImpl

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DemoLibraryClassImpl().simpleToast(this,"hello")
        DemoLibraryClassImpl().startFragment(this)
        ///akjdsfahoids
    }
}