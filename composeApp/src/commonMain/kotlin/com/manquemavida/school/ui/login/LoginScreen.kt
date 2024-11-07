package com.manquemavida.school.ui.login

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.manquemavida.school.navigation.NavGo
import imageview.ImageViewController
import theme.DarkModeColors

@Composable
internal fun LoginScreen(
    navGo: NavGo,
    colors: DarkModeColors,
    imageViewController: ImageViewController
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            imageViewController.imageView("")
        }
    }
}
