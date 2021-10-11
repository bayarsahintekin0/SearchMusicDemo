package com.bayarsahintekin.searchmusicdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.bayarsahintekin.searchmusicdemo.R
import com.bayarsahintekin.searchmusicdemo.ui.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {
    val mainViewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}