package com.kaizen.starter.data.model

import java.io.Serializable

data class Dummy(
    var id: String? = null,
    val imageUrl: String? = null,
    val displayName: String? = null,
) : Serializable
