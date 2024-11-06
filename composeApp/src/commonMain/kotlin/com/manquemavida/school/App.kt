package com.manquemavida.school

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
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
                Text("aoihdqoi")
            }
        }
    }
}