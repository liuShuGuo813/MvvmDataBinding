package com.lsg.mvvmdatabinding.adapter

import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.lsg.mvvmdatabinding.R
import com.lsg.mvvmdatabinding.databinding.ItemListBinding

/**
 *  Created by lsg on 2020/10/15
 */
class SimpleAdapter(layoutResId: Int) : BaseQuickAdapter<String, BaseViewHolder>(layoutResId) {

    override fun onItemViewHolderCreated(viewHolder: BaseViewHolder, viewType: Int) {
        DataBindingUtil.bind<ItemListBinding>(viewHolder.itemView)
    }

    override fun convert(helper: BaseViewHolder, item: String?) {
        val binding = helper.getBinding<ItemListBinding>()
//        binding?.tvTitle?.text = item
        binding?.titleStr = item
    }

}