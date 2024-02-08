package com.astdev.mtn.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.astdev.mtn.ActivationStatus
import com.astdev.mtn.ConfirmationScreen
import com.astdev.mtn.CustomerNumber
import com.astdev.mtn.DepotScreen
import com.astdev.mtn.GsmIdInfo
import com.astdev.mtn.HomeScreen
import com.astdev.mtn.InfoClient
import com.astdev.mtn.LoginScreen
import com.astdev.mtn.MesActivation
import com.astdev.mtn.MesCommissions
import com.astdev.mtn.ModificationNumeroPieces
import com.astdev.mtn.ModificationPiece
import com.astdev.mtn.StartedScreen
import com.astdev.mtn.StatisticScreen
import com.astdev.mtn.Succes
import com.astdev.mtn.ValidationScreen

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

        composable(route = "Confirmation"){
            ConfirmationScreen(navController = navController)
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

        composable(route = "ActivationStatus"){
            ActivationStatus(navController = navController)
        }

        composable(route = "Succes"){
            Succes(navController = navController)
        }
        
        composable(route = "MesActivations"){
            MesActivation(navController = navController)
        }

        composable(route = "MesCommissions"){
            MesCommissions(navController = navController)
        }

        composable(route = "GSM_Id_Info"){
            GsmIdInfo(navController = navController)
        }

        composable(route = "NumeroClient"){
            CustomerNumber(navController = navController)
        }

        composable(route = "InfoClient"){
            InfoClient(navController = navController)
        }

        composable(route = "ModificationPieces"){
            ModificationPiece(navController = navController)
        }

        composable(route = "ModificationNumeroPieces"){
            ModificationNumeroPieces(navController = navController)
        }
    }
}