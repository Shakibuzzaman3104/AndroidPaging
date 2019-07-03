package com.example.androidpaging.retrofit

import com.example.androidpaging.model.ModelEmployee
import io.reactivex.Single
import retrofit2.http.GET

interface ApiInterface {

  @GET("api/v1/employees")
  fun getQuestion(): Single<List<ModelEmployee>>

}