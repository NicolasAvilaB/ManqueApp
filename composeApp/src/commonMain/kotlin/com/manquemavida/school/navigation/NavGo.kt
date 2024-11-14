package com.manquemavida.school.navigation

import moe.tlaster.precompose.navigation.Navigator

class NavGo(
    navigator: Navigator
) {
    val forgotPasswordScreen: () -> Unit = {
        navigator.navigate(NavRoutes.ForgotPasswordScreen.route)
    }

    val popBackStack: () -> Unit = {
        navigator.popBackStack()
    }
}