package io.github.hexiangyuan.lolgame.main.net

import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Creator:HeXiangYuan
 * Date  : 16-12-12
 */
public class Api {
    init {
        val retrofit = Retrofit.Builder()
                .baseUrl("")
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
    }
}
