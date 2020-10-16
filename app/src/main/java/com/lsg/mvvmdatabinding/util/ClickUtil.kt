package com.lsg.mvvmdatabinding.util

import android.view.View
import android.widget.Toast

/**
 *  Created by lsg on 2020/10/15
 */
class ClickUtil {

    fun clickWithMe(view: View){
        Toast.makeText(view.context,"调用ClickUtil类中方法",Toast.LENGTH_LONG).show()
    }

}