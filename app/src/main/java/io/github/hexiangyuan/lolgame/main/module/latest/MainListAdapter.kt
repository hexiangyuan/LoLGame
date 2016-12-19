package io.github.hexiangyuan.lolgame.main.module.latest

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.Adapter
import android.view.LayoutInflater
import android.view.ViewGroup
import io.github.hexiangyuan.lolgame.R
import io.github.hexiangyuan.lolgame.databinding.ItemMainListBinding
import io.github.hexiangyuan.lolgame.main.Model.MainListBean
import java.util.*

/**
 * Creator:HeXiangYuan
 * Date  : 16-12-9
 */
class MainListAdapter() : Adapter<MainListAdapter.ListViewHolder>() {
    var contents: List<MainListBean.Content> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ListViewHolder {
        val listBinding: ItemMainListBinding = DataBindingUtil.inflate(
                LayoutInflater.from(parent!!.context),
                R.layout.item_main_list,
                parent,
                false)
        return ListViewHolder(listBinding)
    }

    override fun onBindViewHolder(holder: ListViewHolder?, position: Int) {
        holder?.bindItem(contents[position])
    }

    override fun getItemCount(): Int = contents.size

    class ListViewHolder(val itemMainListBinding: ItemMainListBinding) : RecyclerView.ViewHolder(itemMainListBinding.root) {

        fun bindItem(content: MainListBean.Content) {
            if (itemMainListBinding.viewModel == null) {
                itemMainListBinding.viewModel = LatestViewModel(content, itemView.context)
            } else {
                itemMainListBinding.viewModel = LatestViewModel(content, itemView.context)
            }
        }
    }

}