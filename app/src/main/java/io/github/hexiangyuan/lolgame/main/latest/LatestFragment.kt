package io.github.hexiangyuan.lolgame.main.latest

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.github.hexiangyuan.lolgame.BaseFragment
import io.github.hexiangyuan.lolgame.main.Model.MainListBean
import java.util.*

/**
 * Creator:HeXiangYuan
 * Date  : 16-12-9
 */
class LatestFragment : BaseFragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val recyclerView: RecyclerView = RecyclerView(context)
        recyclerView.layoutManager = LinearLayoutManager(context)
        val contents: ArrayList<MainListBean.Content> = ArrayList()
        val content = MainListBean.Content()
        content.title = "标题"
        content.subTitle = "副标题"
        content.publicationData = "10-07"
        content.thumbnail = "http://ossweb-img.qq.com/upload/qqtalk/news/201611/04155312197255_282.jpg"
        content.imageUrl = "http://ossweb-img.qq.com/upload/qqtalk/news/201611/04155312197255_480.jpg"
        content.sourceFrom = "腾讯"
        content.pv = "10000"
        for (i in 0..100) {
            contents.add(content)
        }
        val adapter = MainListAdapter()
        adapter.contents = contents
        recyclerView.adapter = adapter
        return recyclerView
    }
}
