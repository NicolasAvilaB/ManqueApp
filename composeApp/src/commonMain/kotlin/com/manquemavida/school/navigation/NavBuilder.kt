package com.manquemavida.school.navigation

import androidx.compose.runtime.Composable
import com.manquemavida.school.ui.forgotpassword.ForgotPasswordScreen
import com.manquemavida.school.ui.login.LoginScreen
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

@Composable
internal fun navForgotPassScreen(
    navGo: NavGo,
    colors: DarkModeColors,
) {
    ForgotPasswordScreen(
        navGo = navGo,
        colors = colors
    )
}
