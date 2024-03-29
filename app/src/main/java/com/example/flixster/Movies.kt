package com.example.flixster

import com.google.gson.annotations.SerializedName

class Movies {
    @SerializedName("poster_path")
    var movieImageUrl: String? = null;

    @SerializedName("title")
    var title: String? = null

    @SerializedName("overview")
    var description: String? = null
}