package com.lsg.mvvmdatabinding

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.databinding.DataBindingUtil
import com.lsg.mvvmdatabinding.databinding.BaseUseBinding
import com.lsg.mvvmdatabinding.util.ClickUtil

class BaseUserActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var mBaseUseBinding : BaseUseBinding
    lateinit var mContext : Activity
    val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mContext = this;
        mBaseUseBinding = DataBindingUtil.setContentView(mContext,R.layout.activity_base_use)
        mBaseUseBinding = DataBindingUtil.setContentView(mContext,R.layout.activity_base_use)
        mBaseUseBinding.textStr = "文本设置数据"
        mBaseUseBinding.onClick = this
        mBaseUseBinding.onClickUtil = ClickUtil()
    }

    override fun onClick(v: View?) {
        Log.e(TAG,"click")
        mBaseUseBinding.textView.text = "点击后设置的文本数据"
    }
}
