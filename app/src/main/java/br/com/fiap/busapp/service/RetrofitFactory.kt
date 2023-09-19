package br.com.fiap.busapp.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitFactory {

    private val URL = "http://api.olhovivo.sptrans.com.br/v2.1/"

    private val retrofitFactory = Retrofit.Builder().baseUrl(URL).addConverterFactory(GsonConverterFactory.create()).build()


    fun getLinhas():LinhaService {
        return retrofitFactory.create(LinhaService::class.java)

    }
}