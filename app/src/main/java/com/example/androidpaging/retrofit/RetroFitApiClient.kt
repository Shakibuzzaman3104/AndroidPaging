package com.example.androidpaging.retrofit

import com.example.androidpaging.model.ModelEmployee
import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.http.GET

interface RetroFitApiClient {

    @GET("api/v1/employees")
    fun getQuestion(): Single<List<ModelEmployee>>


    companion object {
        val instance: RetroFitApiClient by lazy {
            val retrofit = Retrofit.Builder()
                .baseUrl("http://dummy.restapiexample.com/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
            retrofit.create(RetroFitApiClient::class.java)
        }
    }
}