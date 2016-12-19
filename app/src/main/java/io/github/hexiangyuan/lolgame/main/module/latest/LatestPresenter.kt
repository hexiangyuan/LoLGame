package io.github.hexiangyuan.lolgame.main.module.latest

import io.github.hexiangyuan.lolgame.main.Model.MQtNews
import io.github.hexiangyuan.lolgame.main.Model.MainListBean
import io.github.hexiangyuan.lolgame.main.net.QtApi
import rx.Subscriber
import java.util.*

/**
 * Creator:HeXiangYuan
 * Date  : 16-12-19
 */
class LatestPresenter(val view: LatestContract.View) : LatestContract.Presenter {

    init {
        view.setPresenter(this)
    }

    val api by lazy {
        QtApi()
    }

    override fun loadNews(page: Int) {
        view.showLoading()
        api.getNews(12, page, object : Subscriber<MQtNews>() {
            override fun onCompleted() {
                view.hideLoading()
            }

            override fun onNext(t: MQtNews?) {
                val news = MainListBean()
                val list = ArrayList<MainListBean.Content>()
                news.next = t?.next
                news.nextpage = t?.nextpage
                t?.list?.forEach {
                    val content = MainListBean.Content()
                    content.imageUrl = it.image_url_big
                    content.title = it.title
                    content.subTitle = it.summary
                    content.publicationData = it.publication_date
                    content.pv = it.pv
                    content.thumbnail = it.image_url_small
                    content.sourceFrom = "QT"
                    list.add(content)
                }
            }

            override fun onError(e: Throwable?) {
                view.hideLoading()
            }
        })
    }

    override fun start() {
    }

    override fun destroyed() {
    }
}