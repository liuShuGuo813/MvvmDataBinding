package com.lsg.mvvmdatabinding

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.listener.OnItemClickListener
import com.lsg.mvvmdatabinding.adapter.SimpleAdapter
import com.lsg.mvvmdatabinding.databinding.ActivityRecyclerViewBinding
import java.util.ArrayList

class RecyclerViewActivity : AppCompatActivity(), OnItemClickListener {

    lateinit var mRecyclerViewBinding: ActivityRecyclerViewBinding
    lateinit var mContext:Activity
    lateinit var mRecyClerView:RecyclerView
    lateinit var mSimAdapter:SimpleAdapter
    val TAG  = "RecyclerViewActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mContext = this
        mRecyclerViewBinding = DataBindingUtil.setContentView(mContext,R.layout.activity_recycler_view)

        initRecyclerView()
    }

    private fun initRecyclerView() {
        mRecyClerView = mRecyclerViewBinding.rcvList
        mRecyClerView.layoutManager = LinearLayoutManager(mContext).also { LinearLayoutManager.VERTICAL }
        mRecyClerView.addItemDecoration(CustomItemDecoration(this,
            CustomItemDecoration.ItemDecorationDirection.VERTICAL_LIST, R.drawable.linear_split_line))

        val list =  ArrayList<String>()
        for (i in 1..10){
            list.add("文章标题 " + (i + 1))
        }
        mSimAdapter = SimpleAdapter(R.layout.item_list)
        mSimAdapter.data = list
        mRecyClerView.adapter = mSimAdapter
        val size = mSimAdapter.data.size
        Log.e(TAG,"数组长度 ： $size")

        mSimAdapter.setOnItemClickListener(this)

    }

    override fun onItemClick(adapter: BaseQuickAdapter<*, *>?, view: View?, position: Int) {
        Toast.makeText(mContext, mSimAdapter.data[position],Toast.LENGTH_LONG).show()
    }
}
