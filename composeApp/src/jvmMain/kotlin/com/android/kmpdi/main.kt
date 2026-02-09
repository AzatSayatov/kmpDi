package com.android.kmpdi

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.android.kmpdi.di.initKoin

fun main() {
    initKoin()
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "KmpDI",
        ) {
            App()
        }
    }
}