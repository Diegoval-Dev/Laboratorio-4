package com.uvg.laboratorio4_22309.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.uvg.laboratorio4_22309.Screens.EmergencyContactsScreen
import com.uvg.laboratorio4_22309.Screens.MainMenuScreen
import com.uvg.laboratorio4_22309.Screens.MyProfileScreen
import com.uvg.laboratorio4_22309.Screens.SettingsScreen

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScrens.MenuScreen.route){
        composable(route = AppScrens.MenuScreen.route){
            MainMenuScreen(navController)
        }
        composable(route = AppScrens.EmergencyContacts.route){
            EmergencyContactsScreen(navController)
        }
        composable(route = AppScrens.MyProfile.route){
            MyProfileScreen(navController)
        }
        composable(route = AppScrens.Settings.route){
            SettingsScreen(navController)
        }
    }
}