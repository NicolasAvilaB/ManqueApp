package com.manquemavida.school

import androidx.compose.runtime.Composable
import com.manquemavida.school.navigation.NavController
import data.cache.ConfigDevice
import data.cache.SessionCache
import moe.tlaster.precompose.PreComposeApp
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.KoinContext
import theme.AppTheme

@Composable
@Preview
fun App(
    configDevice: ConfigDevice?= null
) {
    PreComposeApp {
        KoinContext {
            AppTheme {
                SessionCache.configDevice = configDevice
                NavController()
            }
        }
    }
}