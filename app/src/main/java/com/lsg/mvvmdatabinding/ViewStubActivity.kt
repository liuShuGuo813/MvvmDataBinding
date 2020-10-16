package com.lsg.mvvmdatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lsg.mvvmdatabinding.base.BaseActivity
import com.lsg.mvvmdatabinding.bean.User
import com.lsg.mvvmdatabinding.databinding.ActivityViewstubBinding

class ViewStubActivity : BaseActivity<ActivityViewstubBinding>() {

    override fun initView() {
        val user = User("千成文",19)
        mBinding.viewStub.viewStub?.inflate()
        mBinding.user = user
    }

    override fun getContentViewId(): Int {
        return R.layout.activity_viewstub
    }

}
