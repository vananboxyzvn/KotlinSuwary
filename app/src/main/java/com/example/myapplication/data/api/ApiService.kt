package com.example.myapplication.data.api

import com.example.myapplication.data.model.User
import io.reactivex.Single

interface ApiService {

    fun getUsers(): Single<List<User>>

}