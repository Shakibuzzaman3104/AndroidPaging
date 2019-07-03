package com.example.androidpaging.retrofit

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory

class RetroFitApiClient {

    companion object {
        val instance: ApiInterface by lazy {
            val retrofit = Retrofit.Builder()
                .baseUrl("http://dummy.restapiexample.com/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
            retrofit.create(ApiInterface::class.java)
        }
    }
}