package com.example.myapplication.data.repository

import com.example.myapplication.data.api.ApiHelper
import com.example.myapplication.data.model.User
import io.reactivex.Single

class MainRepository(private val apiHelper: ApiHelper) {

    fun getUsers(): Single<List<User>> {
        return apiHelper.getUsers()
    }

}