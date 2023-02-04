package com.pulsar.countrieslistmulti.domain.use_cases

import com.pulsar.countrylistkmm.domain.models.Country
import com.pulsar.countrieslistmulti.domain.repositories.CountriesRepository

class FetchAllCountriesUseCase(private val countriesRepository: CountriesRepository) {
    suspend fun execute(): List<Country> {
        return countriesRepository.fetchAllCountries()
    }
}