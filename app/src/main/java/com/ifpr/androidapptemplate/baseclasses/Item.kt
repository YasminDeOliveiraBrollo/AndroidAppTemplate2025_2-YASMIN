package com.ifpr.androidapptemplate.baseclasses

data class Item(
    var modelo : String? = null,
    var endereco: String? = null,
    val base64Image: String? = null,
    val imageUrl: String? = null
)
