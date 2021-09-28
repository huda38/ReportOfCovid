package com.example.reportofcovid

import retrofit2.http.GET
import retrofit2.Call

interface Countryservice {
    @GET("countries")
    fun getAffectedCountryList(): Call<List<MyCountry>>
}