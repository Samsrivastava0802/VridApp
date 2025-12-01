package com.samridhi.vridapp.data.network.repositories

import com.samridhi.vridapp.data.BlogApiClientService
import javax.inject.Inject

class AppRepositories @Inject constructor(
    private val blogApiClientService: BlogApiClientService
) {
    suspend fun getPosts(perPage: Int, page: Int) =
        blogApiClientService.searchBlog(perPage = perPage, page = page)
}