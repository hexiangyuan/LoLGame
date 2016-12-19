package io.github.hexiangyuan.lolgame.main.module.latest

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.github.hexiangyuan.lolgame.BaseFragment
import io.github.hexiangyuan.lolgame.main.Model.MainListBean
import io.github.hexiangyuan.lolgame.main.module.latest.LatestContract.Presenter

/**
 * Creator:HeXiangYuan
 * Date  : 16-12-9
 */
class LatestFragment : BaseFragment(), LatestContract.View {
    private val presenter by lazy { LatestPresenter(this) }
    private val adapter: MainListAdapter by lazy {
        MainListAdapter()
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val recyclerView: RecyclerView = RecyclerView(context)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = adapter
        return recyclerView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        presenter.loadNews(0)
    }

    override fun newsLoaded(news: MainListBean) {
        adapter.contents = news.list
        adapter.notifyDataSetChanged()
    }

    override fun showLoading() {
    }

    override fun hideLoading() {
    }

    override fun setPresenter(presenter: Presenter) {

    }

}
