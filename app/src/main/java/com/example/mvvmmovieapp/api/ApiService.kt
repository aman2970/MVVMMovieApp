package com.example.mvvmmovieapp.api

import com.example.mvvmmovieapp.helper.Constants
import com.example.mvvmmovieapp.models.TvShowResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET(Constants.END_POINT)
    suspend fun getTvShows(): Response<TvShowResponse>
}