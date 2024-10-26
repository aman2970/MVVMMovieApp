package com.example.mvvmmovieapp.repository

import com.example.mvvmmovieapp.api.ApiService
import com.example.mvvmmovieapp.models.TvShowResponse
import retrofit2.Response
import javax.inject.Inject

class TvShowRepository
@Inject
constructor(private val apiService:ApiService) {
    suspend fun getTvShows() = apiService.getTvShows()
}