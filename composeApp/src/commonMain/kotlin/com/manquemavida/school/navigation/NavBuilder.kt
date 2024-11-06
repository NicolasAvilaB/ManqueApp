package com.manquemavida.school.navigation

import androidx.compose.runtime.Composable
import com.manquemavida.school.ui.screens.loginscreen.LoginScreen
import theme.DarkModeColors

@Composable
internal fun navLogin(
    navGo: NavGo,
    colors: DarkModeColors,
) {
    LoginScreen(
        navGo = navGo,
        colors = colors
    )
}