package com.lsg.mvvmdatabinding.util

import android.annotation.SuppressLint
import android.content.Context
import android.widget.Toast

/**
 *  Created by lsg on 2020/10/15
 */
object ToastUtil {

    @JvmStatic
    fun toast(context: Context,str:String?){
        Toast.makeText(context,str,Toast.LENGTH_LONG).show()
    }

}