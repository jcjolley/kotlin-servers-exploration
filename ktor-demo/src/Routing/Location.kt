package com.example.Routing

import com.example.Models.MyLocation
import com.example.Models.Type
import io.ktor.application.call
import io.ktor.locations.get
import io.ktor.response.respondText
import io.ktor.routing.Route

fun Route.location() {
    get<MyLocation> {
        call.respondText("Location: name=${it.name}, arg1=${it.arg1}, arg2=${it.arg2}")
    }
    // Register nested routes
    get<Type.Edit> {
        call.respondText("Inside $it")
    }
    get<Type.List> {
        call.respondText("Inside $it")
    }
}
