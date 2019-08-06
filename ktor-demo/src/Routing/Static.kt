package com.example.Routing

import io.ktor.http.content.resources
import io.ktor.http.content.static
import io.ktor.routing.Route

fun Route.static() {
    // Static feature. Try to access `/static/ktor_logo.svg`
    static("/static") {
        resources("static")
    }
}
