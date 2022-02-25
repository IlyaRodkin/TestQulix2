package com.example.testqulix.model

import com.google.gson.annotations.SerializedName


data class ResponseTest(

	@field:SerializedName("Cur_ID")
	val curID: Int? = null,

	@field:SerializedName("Cur_Name")
	val curName: String? = null,

	@field:SerializedName("Cur_OfficialRate")
	val curOfficialRate: Double? = null,

	@field:SerializedName("Cur_Abbreviation")
	val curAbbreviation: String? = null,

	@field:SerializedName("Date")
	val date: String? = null,

	@field:SerializedName("Cur_Scale")
	val curScale: Int? = null
)
