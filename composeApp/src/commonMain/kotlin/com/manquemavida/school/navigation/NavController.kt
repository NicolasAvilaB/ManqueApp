package com.manquemavida.school.navigation

import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import imageview.ImageViewController
import moe.tlaster.precompose.navigation.NavHost
import moe.tlaster.precompose.navigation.rememberNavigator
import org.koin.compose.koinInject
import theme.getColorsTheme

@Composable
fun NavController(){
    val navigator = rememberNavigator()
    val navGo = remember(navigator) { NavGo(navigator) }
    val startDestination: String = NavRoutes.LoginScreen.route

    val colors = getColorsTheme()

    val imageViewController = koinInject<ImageViewController>()

    NavHost(
        modifier = Modifier.background(color = colors.background),
        navigator = navigator,
        initialRoute = startDestination
    ) {
        scene(
            route = startDestination,
            content = {
                navLoginScreen(
                    navGo = navGo,
                    imageViewController = imageViewController,
                    colors = colors
                )
            }
        )
    }
}
