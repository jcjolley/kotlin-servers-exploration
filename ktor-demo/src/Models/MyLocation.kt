package com.example.Models

import io.ktor.locations.Location

@Location("/location/{name}")
class MyLocation(val name: String, val arg1: Int = 41, val arg2: String = "default")