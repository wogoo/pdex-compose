package com.plcoding.jetpackcomposepokedex.data.remote.responses


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class VersionDetail(
    @Json(name = "rarity")
    val rarity: Int,
    @Json(name = "version")
    val version: Version
)