package com.lsg.mvvmdatabinding

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.lsg.mvvmdatabinding.databinding.MainBinding
import com.lsg.mvvmdatabinding.util.ActivityUtil

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var mContext: Activity
    lateinit var mMainBinding : MainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mContext = this
        mMainBinding = DataBindingUtil.setContentView(mContext,R.layout.activity_main)
        mMainBinding.onClick = this

    }

    override fun onClick(view: View) {
        when(view.id){
            R.id.btn_base -> ActivityUtil.transfer(mContext,BaseUserActivity::class.java)
            R.id.btn_alis -> ActivityUtil.transfer(mContext,AlisActivity::class.java)
            R.id.btn_recyclerview -> ActivityUtil.transfer(mContext,RecyclerViewActivity::class.java)
            R.id.btn_ob -> ActivityUtil.transfer(mContext,ObservableActivity::class.java)
            R.id.btn_ob_field -> ActivityUtil.transfer(mContext,ObservableFieldActivity::class.java)
            R.id.btn_ob_collection -> ActivityUtil.transfer(mContext,ObservableCollectionActivity::class.java)
            R.id.btn_data -> ActivityUtil.transfer(mContext,DataBindActivity::class.java)
            R.id.btn_include -> ActivityUtil.transfer(mContext,IncludeActivity::class.java)
            R.id.btn_vs -> ActivityUtil.transfer(mContext,ViewStubActivity::class.java)
            R.id.btn_binding_adapter -> ActivityUtil.transfer(mContext,BindingAdapterActivity::class.java)
        }
    }
}
