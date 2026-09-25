package com.example.learn_compose.basics.navigation

import kotlinx.serialization.Serializable

//sealed class creates a restricted heirarchy so its subsclass can onlybe defined in the same file

//each subclass and sealed class has their own data and behavior
@Serializable
sealed class mynavroutes {

    @Serializable
    object LoginScreen : mynavroutes()

    @Serializable
    object HomeScreen : mynavroutes()
}