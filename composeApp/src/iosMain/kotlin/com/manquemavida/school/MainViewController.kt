package com.manquemavida.school

import androidx.compose.ui.window.ComposeUIViewController
import org.koin.core.context.startKoin
import ui.di.AppModule
import CrossConfigDevice as ConfigDevice1

fun MainViewController() = ComposeUIViewController { App(ConfigDevice1()) }

fun initKoin(){
    startKoin {
        modules(AppModule())
    }.koin
}