package io.github.hexiangyuan.lolgame.main.module.latest

import io.github.hexiangyuan.lolgame.main.BaseView
import io.github.hexiangyuan.lolgame.main.Model.MainListBean

/**
 * Creator:HeXiangYuan
 * Date  : 16-12-9
 */
interface LatestContract {
    interface View : BaseView {
        fun newsLoaded(news: MainListBean)
        fun showLoading()
        fun hideLoading()
        fun setPresenter(presenter: Presenter)
    }

    interface Presenter {
        fun loadNews(page: Int)
        fun start()
        fun destroyed()
    }
}