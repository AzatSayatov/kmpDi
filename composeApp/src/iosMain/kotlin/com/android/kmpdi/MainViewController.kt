package com.android.kmpdi

import androidx.compose.ui.window.ComposeUIViewController
import com.android.kmpdi.di.initKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) { App() }