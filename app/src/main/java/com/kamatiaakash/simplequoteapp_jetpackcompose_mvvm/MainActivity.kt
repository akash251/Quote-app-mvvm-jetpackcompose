package com.kamatiaakash.simplequoteapp_jetpackcompose_mvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.kamatiaakash.simplequoteapp_jetpackcompose_mvvm.ui.screens.HomePage
import com.kamatiaakash.simplequoteapp_jetpackcompose_mvvm.ui.theme.Mvvm_api_practiceTheme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Mvvm_api_practiceTheme {
                HomePage()
            }
        }
    }
}

