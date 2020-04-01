package com.onebyte.eon.services.networkServices

import retrofit2.Response
import retrofit2.http.*

interface NetworkService {
    @Multipart
    @POST("api/v1/app")
    suspend fun getList(): Response<String>
}