package com.samridhi.vridapp.domain

import com.samridhi.vridapp.data.network.repositories.AppRepositories
import javax.inject.Inject

class FetchPostUseCase @Inject constructor(
    private val appRepositories: AppRepositories,
) {
    suspend operator fun invoke(perPage: Int = 10, page: Int = 1) =
        appRepositories.getPosts(perPage = perPage, page = page)
}