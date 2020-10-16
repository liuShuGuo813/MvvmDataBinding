package com.lsg.mvvmdatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.lsg.mvvmdatabinding.base.BaseActivity
import com.lsg.mvvmdatabinding.bean.HuMan
import com.lsg.mvvmdatabinding.databinding.ActivityDataBindBinding

class DataBindActivity : BaseActivity<ActivityDataBindBinding>(), View.OnClickListener {

    lateinit var huMan: HuMan
    override fun initView() {
        mBinding.onClick = this
        huMan = HuMan("刘树国")
        mBinding.human = huMan
    }

    override fun getContentViewId(): Int {
        return R.layout.activity_data_bind
    }

    override fun onClick(p0: View) {
        when(p0.id){
            R.id.btn_up -> mBinding.btnUp.text = huMan.name.get()
        }
    }

}
