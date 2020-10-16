package com.lsg.mvvmdatabinding

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.Observable
import com.lsg.mvvmdatabinding.base.BaseActivity
import com.lsg.mvvmdatabinding.bean.Dog
import com.lsg.mvvmdatabinding.databinding.ActivityBaseObservableBinding
import com.lsg.mvvmdatabinding.util.ToastUtil
import java.util.*

class ObservableActivity : BaseActivity<ActivityBaseObservableBinding>(), View.OnClickListener {

    lateinit var dog: Dog
    override fun getContentViewId(): Int {
        return R.layout.activity_base_observable
    }

    override fun initView() {
        dog = Dog("边牧","黑白")
        mBinding.dog = dog
        mBinding.onClick = this

        addDogListener()
    }

    private fun addDogListener() {
        dog.addOnPropertyChangedCallback(object : Observable.OnPropertyChangedCallback(){
            override fun onPropertyChanged(sender: Observable?, propertyId: Int) {
                when(propertyId){
                    BR.name -> ToastUtil.toast(mContext,"更改了名称")
                    BR._all -> ToastUtil.toast(mContext,"更改了全部")
                    else -> ToastUtil.toast(mContext,"未知错误")
                }
            }

        })
    }

    override fun onClick(view: View) {
        when(view.id){
            R.id.btn_ntf_name -> dog.setDataOnlyName("田园","黄")
            R.id.btn_ntf_all -> dog.setDataAll("德玛","棕")
        }
    }


}
