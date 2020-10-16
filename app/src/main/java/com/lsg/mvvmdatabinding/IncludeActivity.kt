package com.lsg.mvvmdatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lsg.mvvmdatabinding.base.BaseActivity
import com.lsg.mvvmdatabinding.bean.User
import com.lsg.mvvmdatabinding.databinding.ActivityIncludeBinding

class IncludeActivity : BaseActivity<ActivityIncludeBinding>() {

    override fun initView() {
        val user = User("千成林",16)
        mBinding.user = user
    }

    override fun getContentViewId(): Int {
        return R.layout.activity_include
    }
}
