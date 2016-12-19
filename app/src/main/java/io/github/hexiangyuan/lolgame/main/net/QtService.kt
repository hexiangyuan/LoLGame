package io.github.hexiangyuan.lolgame.main.net

import io.github.hexiangyuan.lolgame.main.Model.MQtBanner
import io.github.hexiangyuan.lolgame.main.Model.MQtNews
import retrofit2.http.GET
import retrofit2.http.Query
import rx.Observable

/**
 * Creator:HeXiangYuan
 * Date  : 16-12-12
 */
public interface QtService {
    @GET("/static/pages/news/phone/c13-list-1.shtml")
    fun getQtBanner(): Observable<MQtBanner>

    //    http://qt.qq.com/php_cgi/news/php/varcache_getnews.php?id=12&page=0&plat=android&version=9713 home list
    @GET("/php_cgi/news/php/varcache_getnews.php")
    fun getQtNews(
            @Query("id") id: Int,
            @Query("page") page: Int,
            @Query("plat") plat: String,
            @Query("version") version: String)
            : Observable<MQtNews>
}