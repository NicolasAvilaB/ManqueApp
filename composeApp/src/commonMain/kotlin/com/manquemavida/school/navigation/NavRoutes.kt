package com.manquemavida.school.navigation

sealed class NavRoutes(var route: String){
    object LoginScreen: NavRoutes("/loginScreen")

    object ForgotPasswordScreen: NavRoutes("/forgotPasswordScreen")
}