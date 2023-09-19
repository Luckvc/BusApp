package br.com.fiap.busapp.service

import br.com.fiap.busapp.model.Linha
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface LinhaService {

    //http://api.olhovivo.sptrans.com.br/v2.1/Linha/Buscar?termosBusca=8000
    @GET("Linha/Buscar?termosBusca={termo}")
    fun getLinhas(@Path("termo") termo: String): Call<List<Linha>>


}