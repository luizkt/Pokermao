package br.com.fiap.lkt.pokermao.model

import com.google.gson.annotations.SerializedName

data class Pokemon(
    @SerializedName("number") val numero: String,
    @SerializedName("name") val nome: String,
    @SerializedName("imageURL") val urlImagem: String
)