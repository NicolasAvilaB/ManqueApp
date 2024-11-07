package com.manquemavida.school.navigation

import androidx.compose.runtime.Composable
import com.manquemavida.school.ui.login.LoginScreen
import imageview.ImageViewController
import theme.DarkModeColors

@Composable
internal fun navLoginScreen(
    navGo: NavGo,
    colors: DarkModeColors,
    imageViewController: ImageViewController,
) {
    LoginScreen(
        imageViewController = imageViewController,
        navGo = navGo,
        colors = colors
    )
}
