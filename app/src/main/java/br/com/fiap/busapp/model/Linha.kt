package br.com.fiap.busapp.model

import com.google.gson.annotations.SerializedName

data class Linha(
    @SerializedName("cl") val codigo: String = "",
    @SerializedName("tp") val inicio: String = "",
    @SerializedName("ts") val fim: String = ""

)
