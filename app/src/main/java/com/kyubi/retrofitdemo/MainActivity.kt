package com.kyubi.retrofitdemo

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.annotation.RequiresApi
import com.kyubi.retrofitdemo.retrofit.RetrofitHelper
import com.kyubi.retrofitdemo.utlis.NetworkUtlis
import com.kyubi.retrofitexample.models.Products
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {


    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (NetworkUtlis.isOnline(this)){
            GlobalScope.launch {

                RetrofitHelper.getInstance().getProduct().body()?.title?.let {
                    Log.e("Product", it)
                }

            }
        }




    }
}