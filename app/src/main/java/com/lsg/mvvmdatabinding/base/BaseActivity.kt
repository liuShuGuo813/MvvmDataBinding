package com.lsg.mvvmdatabinding.base

import android.app.Activity
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel

/**
 *  Created by lsg on 2020/10/15
 */
abstract class BaseActivity<DB : ViewDataBinding> : AppCompatActivity(){

    lateinit var mContext: Activity
    lateinit var mBinding: DB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mContext = this
        mBinding = DataBindingUtil.setContentView(mContext,getContentViewId())

        initView()
    }

    /**
     * 处理逻辑业务
     */
    protected abstract fun initView()

    abstract fun getContentViewId(): Int;

}