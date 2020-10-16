package com.lsg.mvvmdatabinding.util

import android.view.View
import android.widget.Toast

/**
 *  Created by lsg on 2020/10/15
 */
object ClickStaticUtil {

    @JvmStatic
    fun onClickWithMe(view: View){
        Toast.makeText(view.context,"调用静态类中的方法",Toast.LENGTH_LONG).show()
    }

}