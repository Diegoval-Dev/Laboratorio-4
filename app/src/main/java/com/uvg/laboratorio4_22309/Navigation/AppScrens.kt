package com.uvg.laboratorio4_22309.Navigation

sealed class AppScrens(val route: String){
    object MenuScreen: AppScrens("menu_screen")
    object Settings: AppScrens("settings_screen")
    object EmergencyContacts: AppScrens("emergency_contacts")
    object MyProfile: AppScrens("my_profile")
}
