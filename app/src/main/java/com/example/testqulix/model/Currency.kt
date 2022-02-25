package com.example.testqulix.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Currency(

    @Json(name = "Cur_ID")
    val curID: Int? = null,
    @Json(name = "Cur_Name")
    val curName: String? = null,
    @Json(name = "Cur_OfficialRate")
    val curOfficialRate: Double? = null,
    @Json(name = "Cur_Abbreviation")
    val curAbbreviation: String? = null,
    @Json(name = "Date")
    val date: String? = null,
    @Json(name = "Cur_Scale")
    val curScale: Int? = null
)
