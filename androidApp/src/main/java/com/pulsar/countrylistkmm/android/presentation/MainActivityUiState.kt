package com.pulsar.countrylistkmm.android.presentation

import com.pulsar.countrylistkmm.domain.models.Country


data class MainActivityUiState(
    val isLoading: Boolean = false,
    val countriesList: List<Country> = listOf()
)
