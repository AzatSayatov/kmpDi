package com.android.kmpdi.di

import com.android.kmpdi.dependency.DbClient
import com.android.kmpdi.dependency.MyViewModel
import org.koin.compose.viewmodel.dsl.viewModelOf
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

actual val platformModule = module {
    singleOf(::DbClient)

}