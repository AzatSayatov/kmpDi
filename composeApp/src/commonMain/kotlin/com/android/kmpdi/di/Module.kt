package com.android.kmpdi.di

import com.android.kmpdi.dependency.MyRepository
import com.android.kmpdi.dependency.MyRepositoryImpl
import com.android.kmpdi.dependency.MyViewModel
import org.koin.compose.viewmodel.dsl.viewModelOf
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

expect val platformModule: Module


val sharedModule = module {
    singleOf(::MyRepositoryImpl).bind<MyRepository>()
    viewModelOf(::MyViewModel)
}