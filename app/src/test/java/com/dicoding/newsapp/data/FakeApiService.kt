package com.dicoding.newsapp.data

import com.dicoding.newsapp.data.remote.response.NewsResponse
import com.dicoding.newsapp.data.remote.retrofit.ApiService
import com.dicoding.newsapp.utils.DataDummy

class FakeApiService : ApiService {

    private val dummyRespone = DataDummy.generateDummyNewsResponse()
    override suspend fun getNews(apiKey: String): NewsResponse {
        return dummyRespone
    }
}