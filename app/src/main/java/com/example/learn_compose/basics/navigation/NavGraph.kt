package com.example.learn_compose.basics.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavGraph() {

    val navController = rememberNavController()

    NavHost(
        navController =navController,
        startDestination = mynavroutes.LoginScreen
    ) {

        composable<mynavroutes.LoginScreen> {LoginScreenui(navController)  }

        composable<mynavroutes.HomeScreen> {HomeScreenUi(navController)  }
    }



}