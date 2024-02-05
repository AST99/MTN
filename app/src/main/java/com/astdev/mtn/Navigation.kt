package com.astdev.mtn

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun SetupNavGraph(navController: NavHostController){
    NavHost(navController = navController, startDestination = "StartedScreen"){
        composable(route = "StartedScreen") {
            StartedScreen(navController = navController)
        }

        composable(route = "Login"){
            LoginScreen(navController = navController)
        }

        composable(route = "Validation"){
            ValidationScreen(navController = navController)
        }
        
        composable(route = "Accueil"){
            HomeScreen(navController = navController)
        }

        composable(route = "Statistiques"){
            StatisticScreen(navController = navController)
        }

        composable(route = "Depot"){
            DepotScreen(navController = navController)
        }
    }
}