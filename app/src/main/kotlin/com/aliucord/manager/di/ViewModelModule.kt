package com.aliucord.manager.di

import com.aliucord.manager.ui.viewmodel.*
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val viewModelModule = module {
    viewModelOf(::HomeViewModel)
    viewModelOf(::PluginsViewModel)
    viewModelOf(::AboutViewModel)
    viewModelOf(::InstallViewModel)
    viewModelOf(::SettingsViewModel)
    viewModelOf(::UpdaterViewModel)
}
