package com.kaizen.starter.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.kaizen.starter.ui.main.view.MainScreen
import com.mygame.marvelsnapclone.ui.theme.DeckManagementScreen

@Composable
fun Navigation(navController: NavHostController) { // Accept NavHostController as parameter
    NavHost(navController = navController, startDestination = "main") {
        composable("main") { MainScreen(navController) }
        composable("deckManagement") { DeckManagementScreen(navController) }// Add other composable routes as needed
        composable("createDeck") { CreateDeckScreen(navController) }
    }
}