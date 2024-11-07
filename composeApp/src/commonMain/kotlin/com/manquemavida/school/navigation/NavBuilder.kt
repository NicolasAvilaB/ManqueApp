package com.manquemavida.school.navigation

import androidx.compose.runtime.Composable
import com.manquemavida.school.ui.screens.login.LoginScreen
import theme.DarkModeColors

@Composable
internal fun navLoginScreen(
    navGo: NavGo,
    colors: DarkModeColors,
) {
    LoginScreen(
        navGo = navGo,
        colors = colors
    )
}
