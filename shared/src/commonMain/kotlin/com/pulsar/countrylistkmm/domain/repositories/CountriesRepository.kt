package com.pulsar.countrieslistmulti.domain.repositories

import com.pulsar.countrylistkmm.domain.models.Country

interface CountriesRepository {
   suspend fun fetchAllCountries(): List<Country>
}