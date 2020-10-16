package com.lsg.mvvmdatabinding

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.lsg.mvvmdatabinding.bean.User
import com.lsg.mvvmdatabinding.databinding.ActivityAlisBinding

class AlisActivity : AppCompatActivity() {

    lateinit var mAlisBinding: ActivityAlisBinding
    lateinit var mContext: Activity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mContext = this
        mAlisBinding = DataBindingUtil.setContentView(mContext,R.layout.activity_alis)
        var userFirst = User("刘树国",19)
        mAlisBinding.userFirst = userFirst

        var userSecond = com.lsg.mvvmdatabinding.User("姓名",666)
        mAlisBinding.userSecond = userSecond
    }
}
