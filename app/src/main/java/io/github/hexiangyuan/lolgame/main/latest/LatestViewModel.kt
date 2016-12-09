package io.github.hexiangyuan.lolgame.main.latest

import android.content.Context
import io.github.hexiangyuan.lolgame.main.Model.MainListBean

/**
 * Creator:HeXiangYuan
 * Date  : 16-12-9
 */
class LatestViewModel(val content: MainListBean.Content, val context: Context) {

    fun getTitle(): String = content.title
    fun getSubTitle(): String = content.subTitle
    fun getThumbnail(): String = content.thumbnail
    fun getImageUrl(): String = content.imageUrl
    fun getSourceFrom():String = content.sourceFrom
    fun getPublicationData():String = content.publicationData
    fun getPageView():String = content.pv
}
