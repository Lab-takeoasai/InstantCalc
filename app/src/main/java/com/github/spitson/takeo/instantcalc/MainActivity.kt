package com.github.spitson.takeo.instantcalc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.beardedhen.androidbootstrap.TypefaceProvider

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        TypefaceProvider.registerDefaultIconSets();
        setContentView(R.layout.activity_main)
    }
}
