package com.pulsar.countrylistkmm.network.repositories


import com.pulsar.countrylistkmm.data.models.CountryListDTO
import com.pulsar.countrylistkmm.data.models.toDomain
import com.pulsar.countrylistkmm.network.Constants
import com.pulsar.countrieslistmulti.domain.repositories.CountriesRepository
import com.pulsar.countrylistkmm.domain.models.Country
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*

class CountriesRepositoryImpl(private val ktorClient: HttpClient) : CountriesRepository {
    override suspend fun fetchAllCountries(): List<Country> {
        //val actual = Json.decodeFromString<ApiResponse>(response.content.toString())
        //ktorClient.get(Constants.ALL_COUNTRIES).content.toString()
        val actual: MutableList<CountryListDTO.CountryDTO> = ktorClient.get(Constants.ALL_COUNTRIES).body()
        return actual.toDomain()
    }
}