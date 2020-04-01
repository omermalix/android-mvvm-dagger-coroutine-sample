package com.onebyte.eon.services.repositories

import com.onebyte.eon.services.networkServices.NetworkService
import retrofit2.Response
import javax.inject.Inject

class Repository @Inject constructor(private val networkService: NetworkService) {
    suspend fun getList(): Response<String> {
        return networkService.getList()
    }
}