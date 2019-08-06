package com.example.Routing

import com.example.Daos.MyDao
import io.ktor.application.call
import io.ktor.http.ContentType
import io.ktor.response.respond
import io.ktor.response.respondText
import io.ktor.routing.Route
import io.ktor.routing.get
import org.koin.ktor.ext.inject

fun Route.basic() {
    val myDao: MyDao by inject()

    get("/") {
        call.respondText(myDao.getHello(), contentType = ContentType.Text.Plain)
    }

    get("/json/gson") {
        call.respond(mapOf("hello" to "world"))
    }
}