package com.example

import io.ktor.http.HttpMethod
import io.ktor.http.HttpStatusCode
import io.ktor.server.testing.handleRequest
import io.ktor.server.testing.withTestApplication
import org.koin.test.KoinTest
import kotlin.test.Test
import kotlin.test.assertEquals

class ApplicationTest : KoinTest {
    @Test
    fun `Testing dependency injection with KoinTest`() {
        withTestApplication({ module(testing = true) }) {
            handleRequest(HttpMethod.Get, "/").apply {
                assertEquals(HttpStatusCode.OK, response.status())
                assertEquals("Pleasantly Injectable", response.content)
            }
        }
    }
}
