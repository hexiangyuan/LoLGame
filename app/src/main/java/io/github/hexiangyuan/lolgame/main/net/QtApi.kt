package io.github.hexiangyuan.lolgame.main.net

import io.github.hexiangyuan.lolgame.main.Model.MQtBanner
import io.github.hexiangyuan.lolgame.main.Model.MQtNews
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import rx.Subscriber
import rx.Subscription
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

/**
 * Creator:HeXiangYuan
 * Date  : 16-12-12
 */
public class QtApi() {
    val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl("http://qt.qq.com")
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
    val qtService: QtService = retrofit.create(QtService::class.java)


    public fun getNews(id: Int, page: Int, subscriber: Subscriber<MQtNews>): Subscription
            = qtService.getQtNews(id, page, "android", "9713")
            .subscribeOn(Schedulers.newThread())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(subscriber)

    public fun getBanner(subscriber: Subscriber<MQtBanner>): Subscription =
            qtService.getQtBanner()
                    .subscribeOn(Schedulers.newThread())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(subscriber)
}
