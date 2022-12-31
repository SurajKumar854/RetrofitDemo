package com.kyubi.retrofitdemo.retrofit

import com.kyubi.retrofitdemo.utlis.Constant
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {

    fun getInstance() : FStoreApi{
        val retrofit: Retrofit = Retrofit.Builder().baseUrl(Constant.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()).build()


        return retrofit.create((FStoreApi::class.java))
    }

}