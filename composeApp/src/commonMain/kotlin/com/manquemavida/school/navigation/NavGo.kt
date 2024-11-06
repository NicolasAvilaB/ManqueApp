package com.manquemavida.school.navigation

import moe.tlaster.precompose.navigation.Navigator

class NavGo(
    navigator: Navigator
) {
    val popBackStack: () -> Unit = {
        navigator.popBackStack()
    }
}