package com.kyubi.retrofitexample.models



data class Products(
    val product_id: Int,
    val category: String,
    val description: String,
    val id: Int,
    val image: String,
    val price: Double,
    val title: String
)

