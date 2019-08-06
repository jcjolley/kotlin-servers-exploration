package com.example.Routing

import io.ktor.http.cio.websocket.Frame
import io.ktor.http.cio.websocket.readText
import io.ktor.routing.Route
import io.ktor.websocket.webSocket

fun Route.webSocket() {
    webSocket("/myws/echo") {
        send(Frame.Text("Hi from server"))
        while (true) {
            val frame = incoming.receive()
            if (frame is Frame.Text) {
                send(Frame.Text("Client said: " + frame.readText()))
            }
        }
    }
}