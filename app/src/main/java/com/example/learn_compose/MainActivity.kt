package com.example.learn_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.AlertDialog
import com.example.learn_compose.basics.AlertDialogExample
import com.example.learn_compose.basics.navigation.LoginScreenui
import com.example.learn_compose.basics.navigation.NavGraph
import com.example.learn_compose.ui.theme.Learn_composeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Learn_composeTheme {
                NavGraph()
                }
            }
        }
    }