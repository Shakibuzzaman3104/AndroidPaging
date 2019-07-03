package com.example.androidpaging.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class ModelEmployee( @SerializedName("id")
                          @Expose
                          private var id: String? = null,
                          @SerializedName("employee_name")
                          @Expose
                          private var employeeName: String? = null,
                          @SerializedName("employee_salary")
                          @Expose
                          private var employeeSalary: String? = null,
                          @SerializedName("employee_age")
                          @Expose
                          private var employeeAge: String? = null,
                          @SerializedName("profile_image")
                          @Expose private var profileImage: String? = null)


