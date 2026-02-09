package com.android.kmpdi

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform