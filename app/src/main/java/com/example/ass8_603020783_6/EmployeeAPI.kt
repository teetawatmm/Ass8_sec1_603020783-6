package com.example.ass8_603020783_6

import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface EmployeeAPI {
    @GET( "allstd")
    fun retrieveEmployee(): Call<List<Employee>>

    @FormUrlEncoded
    @POST( "std")
    fun insertEmp(
        @Field("emp_name") emp_name: String,
        @Field("emp_gender") emp_gender: String,
        @Field("emp_mail") emp_mail: String,
        @Field("emp_salary") emp_salary: Int): Call<Employee>
}