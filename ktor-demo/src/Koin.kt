package com.example

import com.example.Daos.MyDao
import org.koin.dsl.module

val koinModule = module {
    single { MyDao() }
}

