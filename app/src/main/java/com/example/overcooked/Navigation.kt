package com.example.overcooked

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.overcooked.screens.SignInScreen
import com.example.overcooked.screens.SignUpScreen
import kotlinx.serialization.Serializable

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = SignUpScreenNav
    ) {
        composable<SignUpScreenNav> {
            SignUpScreen(navController)
        }
        composable<SignInScreenNav> {
            SignInScreen(navController)
        }
    }
}

@Serializable
object SignUpScreenNav

@Serializable
object SignInScreenNav