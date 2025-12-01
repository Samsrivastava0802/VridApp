package com.samridhi.vridapp.data

import com.samridhi.vridapp.data.network.models.response.PostInformation
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface BlogApiClientService {
    @GET("posts")
    suspend fun searchBlog(
        @Query("per_page") perPage: Int,
        @Query("page") page: Int
    ) : Response<List<PostInformation>>
}