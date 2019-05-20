package com.example.apicalling

import retrofit2.http.GET
import io.reactivex.Observable

interface GithubApiServices {

    @GET("posts")
    fun getData():  Observable<List<JsonFile>>

}