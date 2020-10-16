package com.lsg.mvvmdatabinding

import android.view.View
import androidx.databinding.Observable
import com.lsg.mvvmdatabinding.base.BaseActivity
import com.lsg.mvvmdatabinding.bean.Dog
import com.lsg.mvvmdatabinding.bean.UserInfo
import com.lsg.mvvmdatabinding.databinding.ActivityObservableFieldBinding
import com.lsg.mvvmdatabinding.util.ToastUtil

/**
 *  Created by lsg on 2020/10/15
 */
class ObservableFieldActivity: BaseActivity<ActivityObservableFieldBinding>(), View.OnClickListener {
    lateinit var user: UserInfo
    override fun getContentViewId(): Int {
        return R.layout.activity_observable_field
    }

    override fun initView() {
        user = UserInfo("边牧",19)
        mBinding.user = user
        mBinding.onClick = this

    }

    override fun onClick(view: View) {
        when(view.id){
            R.id.btn_up_name -> user.name.set("二哈")
            R.id.btn_up_age -> user.age.set(16)
        }
    }

}