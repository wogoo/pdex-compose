package com.plcoding.jetpackcomposepokedex.data.remote.responses


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GenerationIv(
    @Json(name = "diamond-pearl")
    val diamondPearl: DiamondPearl,
    @Json(name = "heartgold-soulsilver")
    val heartgoldSoulsilver: HeartgoldSoulsilver,
    @Json(name = "platinum")
    val platinum: Platinum
)