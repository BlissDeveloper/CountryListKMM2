package com.pulsar.countrylistkmm.di

import com.pulsar.countrylistkmm.network.KtorClient
import com.pulsar.countrylistkmm.network.repositories.CountriesRepositoryImpl
import com.pulsar.countrieslistmulti.domain.repositories.CountriesRepository
import com.pulsar.countrieslistmulti.domain.use_cases.FetchAllCountriesUseCase
import org.koin.dsl.module

val networkModule = module {
    single {
        KtorClient.getCountriesClient()
    }
    single<CountriesRepository> {
        CountriesRepositoryImpl(get())
    }
    /*
        USE CASES
     */
    single {
        FetchAllCountriesUseCase(get())
    }
}