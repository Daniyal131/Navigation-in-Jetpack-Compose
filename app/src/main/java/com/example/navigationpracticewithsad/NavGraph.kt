package com.example.navigationpracticewithsad

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Greeting.route){
        composable(route = Screen.Greeting.route){
            Greeting(navController)
        }
        composable(route = Screen.HowAreYou.route){
            HowAreYou(navController)
        }
        composable(route = Screen.IamGood.route){
            IamGood(navController)
        }
        composable(route = Screen.Stfu.route){
            Stfu(navController)
        }
    }
}