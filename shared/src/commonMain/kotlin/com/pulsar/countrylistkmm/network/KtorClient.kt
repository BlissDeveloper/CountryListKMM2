package com.pulsar.countrylistkmm.network

import io.ktor.client.*
import io.ktor.client.plugins.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.plugins.logging.*
import kotlinx.serialization.json.Json
import io.ktor.serialization.kotlinx.json.json


class KtorClient {
    companion object {
        private val countriesClient = HttpClient() {
            install(ContentNegotiation) {
                json(Json {
                    ignoreUnknownKeys = true
                    prettyPrint = true
                    isLenient = true
                })
            }
            install(Logging)
            defaultRequest {
                url("https://restcountries.com/v3.1/")
            }
        }
        fun getCountriesClient() = countriesClient
    }
}