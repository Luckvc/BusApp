package br.com.fiap.busapp.model

import com.google.gson.annotations.SerializedName

data class Linha(
    @SerializedName("cl") val codigo: String = "",
    @SerializedName("lc") val circular: String = "",
    @SerializedName("lt") val numero: String = "",
    @SerializedName("tl") val sufixo: String = "",
    @SerializedName("sl") val sentido: String = "",
    @SerializedName("tp") val inicio: String = "",
    @SerializedName("ts") val fim: String = ""

)
