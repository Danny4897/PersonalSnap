package com.kaizen.starter.network.model

import com.google.gson.annotations.SerializedName

data class DummyResponse(

    @SerializedName("id")
    var id: String? = null,

    @SerializedName("displayName")
    var displayName: String? = null,

    @SerializedName("imageUrl")
    var imageUrl: String? = null,

    )